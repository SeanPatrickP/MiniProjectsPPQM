//decision making 25/09/18 Sean Palmer - calculates the body age of the person
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int rAge;
        int rHr;
        int rStretch;
        rAge = scan.nextInt();
        System.out.println("What is your heart rate?");
        rHr = scan.nextInt();
        System.out.println("How far can you stretch?");
        rStretch = scan.nextInt();
	//input();

        // in the maths() below this carries the variables to the next method.
	maths(rAge, rHr, rStretch);
    System.exit(0);


    }
// in this method according to the users input variables there age is changed then printed at the end
//
//    public static void input() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What is your age?");
//        int rAge;
//        int rHr;
//        int rStretch;
//        rAge = scan.nextInt();
//        System.out.println("What is your heart rate?");
//        rHr = scan.nextInt();
//        System.out.println("How far can you stretch?");
//        rStretch = scan.nextInt();
//    }

        public static Integer maths(int rAge, int rHr, int rStretch ) {

        if (rHr < 60)
            rAge = rAge - 4;

        else if (60 < rHr && rHr < 64)
            rAge = rAge - 2;

        else if (65 < rHr && rHr < 72)
            rAge = rAge + 1;

        else if (rHr > 73)
            rAge = rAge + 2;

        if (rStretch < 25)
            rAge = rAge + 3;

        else if (rStretch < 36 && rStretch > 25)
            rAge = rAge + 2;

        else if (rStretch == 37)
            rAge = rAge + 0;

        else if (rStretch < 40 && rStretch > 38)
            rAge = rAge - 2;

        else if (rStretch > 40)
            rAge = rAge - 3;


        System.out.println("this is your age " + rAge);


        int maths = rAge;
        return maths;

    }

    }


