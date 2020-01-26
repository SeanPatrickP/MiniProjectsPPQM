// Arrays exercise 6, Sean Palmer 13/10/18

import java.util.Scanner;

public class Main {

    //in the main method we will call the subsequent method to ask the question then return the results of the input
    public static void main(String[] args) {
        String questions [] = {"","","","",""};
        int numberofd [] = {0,0,0,0,0};

    askquestions(questions, numberofd);




            }


    public static void askquestions(String questions [], int numberofd []) {
        int max=0;

        int nr = 0;
        Scanner scan = new Scanner(System.in);
        for(int i=1;i<5;i++) {
            System.out.println("what is the name of track " + i);
            String result;
            result = scan.nextLine();
            questions [i] = result;
            System.out.println("how many times was that track downloaded ?");
            result = scan.nextLine();
        //here the input of a String from the user is converted to an integer, as this happens within the for loop, each time the number of downloads for the user specified track is added to the array, with i selecting the location within the array
            nr = Integer.parseInt(result);
            numberofd [i] = nr;
            }
       for(int i=1;i<5;i++)
           if(max < numberofd [i])
               max = numberofd [i];
    //here a test is performed on the users input of the number of downloads, this ascertains whether the each sequential input of number of downloads is greater than teh previous, if this is the case, this is then stored in teh variable max, at the end of the program as specified the maximum number of downloads for the provided tracks is printed to the screen
           int location = 0;
        for(int i=1;i<5;i++)
            if(numberofd[i] == max)
            location = i;

        System.out.println("most downloaded is " + questions[location]+ " this has been downloaded " + numberofd[location]);
        int sum = numberofd[1] + numberofd[2] + numberofd[3] + numberofd[4];
        System.out.println("total number of downloads was " + sum);

        System.out.println("details of downloads: ");
        for(int i=1;i<5;i++)
        System.out.println( questions [i] + " " + numberofd [i]);

            }



            }




