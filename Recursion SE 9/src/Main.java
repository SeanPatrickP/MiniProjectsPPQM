// Sean Palmer Short Exercise 9 Recursion 04/12/18
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        obtainUserInput();

    }

    public static void obtainUserInput(){
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();
        checkIfSingleDigit(response);
        getOperators(response);


    }

    public static void checkIfSingleDigit(String response){
            if(response.length()==1)
            System.out.println(response);

        else return;



    }

    public static void getOperators(String response) {
        //work backwards with the string to deal with the numbers that come with the last operator
        int length = response.length();
        int counter = length;
        int countOperator = 0;
        int nearestOp = 0;
        int request = 0;


        String[] arrayS = new String[length];
        //store each of the chars/ints into an array
        //array works left to right
        for (int i = 0; i < length; i++) {
            arrayS[i] = response.substring(counter - 1, counter);
            counter = counter - 1;
    }
        countOperator = findNumeberOfOperators(arrayS, countOperator);
        recursionEngine(arrayS, nearestOp, countOperator, request);
    }


    public static void recursionEngine(String [] arrayS, int nearestOp, int countOperator, int request){
        nearestOp = findPositionOfOperators(arrayS,nearestOp);
        String Op = whatOp(arrayS,nearestOp);
        request = dealwithOp(arrayS,nearestOp, request, Op, countOperator);

        System.out.println(request);

    }

    public static int findNumeberOfOperators(String [] passThrough, int counter){
        //find how many operators
        for(int i = 0; i < passThrough.length; i++){
            if(passThrough[i].equals("!")||passThrough[i].equals("*")||passThrough[i].equals("+"))
            counter = counter + 1;
    }
        return counter;
    }

    public static int findPositionOfOperators(String [] position, int nearest){
        //find position of nearest operator in array - this checks the array for the position of the nearest operator and will do this until a result is found then stop, we also reset nearest back to 0 at the beginning of the method
        nearest = 0;
        for (int i = 0; i < position.length; i++) {
            if(nearest == 0) {
                if (position[i].equals("!") || position[i].equals("*") || position[i].equals("+"))
                    nearest = nearest + i;
    }
        else break;


    }

        return nearest;
    }

    public static String whatOp(String [] arrayS, int nearestOp){

        return arrayS[nearestOp];
    }

    public static int dealwithOp(String [] arrayS, int nearestOp, int request, String Op, int CountOp){
        //deal with this operation and replace field in array with null so that on the next recursion the next operator is dealt with
        arrayS[nearestOp] = "null";
        int i = 0;
        //the int i has the job of finding the number for the operator to then work on
        if(Op.equals("+")) {
            CountOp = CountOp - 1;
            i = nearestOp - 1;
            int var1 = Integer.parseInt(arrayS[i]);
            int result = 0;
            request = recursionAdder(arrayS,nearestOp,request,Op,i, var1, result);

            while(i > 0 && !arrayS[i-1].equals("+") && !arrayS[i-1].equals("*") && !arrayS[i-1].equals("!") && request != 0 && !arrayS[i-1].equals("null")) {
                i = i - 1;
                int var2 = Integer.parseInt(arrayS[i]);
                request = recursionAdder(arrayS, nearestOp, request, Op, i, var2, result);
            }
        }

        if(Op.equals("*")) {
            CountOp = CountOp - 1;
            i = nearestOp - 1;
            request = recursionMultiplier(arrayS, nearestOp, request, Op, i);
        }

        if(Op.equals("!")) {
            CountOp = CountOp - 1;
            i = nearestOp - 1;
            request = recursionFactorial(arrayS, nearestOp, request, Op, i);
        }

        if (CountOp != 0)
        recursionEngine(arrayS, nearestOp, CountOp, request);
        //remember that with recursion the program unwinds itself to ensure that all return statements have been met so be careful of printing multiple results
        return request;

    }

    public static int recursionAdder(String [] arrayS, int nearestOp, int request, String Op, int i, int var1, int result){
        //takes 1 at a time

        if (var1 == 0)
            return request;
        else result = recursionAdder(arrayS, nearestOp, request, Op, i, var1 - 1, result) + 1;


        return result;


    }

    public static int recursionMultiplier(String [] arrayS, int nearestOp, int request, String Op, int i){
        //takes 1 at a time - also making sure that the request is greater than 0 so that the answer returned is not 0
    if(i >= 0 && !arrayS[i].equals("+") && !arrayS[i].equals("*") && !arrayS[i].equals("!") && request > 0 && !arrayS[i].equals("null")) {
        int var1 = Integer.parseInt(arrayS[i]);
        request = var1 * request;
        i = i - 1;
        recursionMultiplier(arrayS, nearestOp, request, Op, i);
    }
    if(i >= 0 && !arrayS[i].equals("+") && !arrayS[i].equals("*") && !arrayS[i].equals("!") && request == 0 && !arrayS[i].equals("null")) {
         int var1 = Integer.parseInt(arrayS[i]);
         request = var1;
         i = i - 1;
         recursionMultiplier(arrayS, nearestOp, request, Op, i);
    }

        return request;
    }

    public static int recursionFactorial(String [] arrayS, int nearestOp, int request, String Op, int i){
        //takes 1 at a time - possibilities - either factorial of a number or factorial of an expression that has had a previous operation
        int var1 = 0;
        int recursionVar = 0;
        if(request == 0) {
            var1 = Integer.parseInt(arrayS[i]);
            recursionVar = recurse(recursionVar, var1);
        }
        if(request != 0)
            recursionVar = recurse(recursionVar, request);
        return recursionVar;
    }

    public static int recurse(int recursionVar, int var1){

            if(var1 == 1)
            return 1;

            else {
                recursionVar = recurse(recursionVar,(var1 - 1)) * var1;
                return recursionVar;
            }

    }

    }



