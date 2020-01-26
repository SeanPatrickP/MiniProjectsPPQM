// While loops exercise 7, Sean Palmer 16/10/18
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        isTheTrainLate();
// here the method called will ask the user how many minutes late the train was, if this is a negative number the do while loop will stop

    }

    public static void isTheTrainLate(){
        Scanner scan = new Scanner(System.in);
        int iresponse;
        int onTime = 0;
        int notOnTime = 0;
        int worstLate = 0;
        do {
            System.out.println("how many mins late was the train?");
            String response = scan.nextLine();
            iresponse = Integer.parseInt(response);
            // this keeps a tab on how many times the train was on time, adding 1 to the variable onTime if the condition ( = 0 ) is met
            if (iresponse == 0) {
                onTime = onTime + 1;
            }
            // similarly here in order to print the time of the worst late running train to the screen, an if statement returns the boolean dependent on whether each sequential user input is greater than the previous one, this variable thus keeps track of the greatest train delay
            if(iresponse > worstLate) {
                worstLate = iresponse;
            }
            // the if statement here keeps track if the train is not on time (ie. is greater than 0 as an input from the user, this is used later on in the following while loop calculation to ascertain the total number of inputs from the user, enabling a result of how many trains out of the total were on time to be printed to the screen
            if (iresponse > 0) {
                notOnTime = notOnTime + 1;
            }



        }

        while (iresponse >= 0);

        System.out.println(onTime+ " train out of " + (notOnTime + onTime) + " was on time!");

        System.out.println("the worst train was "+ worstLate + " mins late!");


    }
}
