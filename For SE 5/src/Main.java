//For loops exercise 5 Sean Palmer 09/10/18

import java.util.Scanner;

public class Main {
// here the program will ask what are the max points for the event, using the scanner to save this input to the variable maxpoints
    public static void main(String[] args) {
        int runningTotal = 0;
        System.out.println("What are the max points for this event?");
        Scanner scan2 = new Scanner(System.in);
        int maxpoints = scan2.nextInt();
// here the variable runningtotal is passed into the method call swimmer, the value of which (an integer) is then returned to the main, where this is then passed to the calculator to see if the combination of points is legal, taking into account the users input
        runningTotal = swimmer(runningTotal);
        calc(runningTotal, maxpoints);
        }

    public static int swimmer(int runningTotal) {
        int i;

// the below for loop asks the user 4 times the disability classification of the swimmers accumulating the result each time within the variable runningTotal
        for(i=1; i<5;i++)
        {
            System.out.println("what is the classification of Swimmer " + i);
            Scanner scan = new Scanner(System.in);

            runningTotal = runningTotal + scan.nextInt();


        }



        return runningTotal;
        }
// here the calculation is made to see if the number of points entered is legal for the event
    public static void calc(int runningTotal, int maxpoints) {

        if(runningTotal <= maxpoints)
            System.out.println("this team has " + runningTotal+ " so legal");
        else
            System.out.println(runningTotal + " so not legal");

        }

        }
