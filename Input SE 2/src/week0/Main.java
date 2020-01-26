//program is a student loan calculator, created by Sean Palmer 24/09/18
package week0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//work out how much they owe.


        // They first input how much they owed at the start of the year without the £ sign,
        // then how much they paid off that year.
        // assuming both of these are who numbers.
        // It then adds 6.3% interest to the total at the end of the year
        // and prints out the new total
        // int meaning integer
        // double is referenced due to the decimal factor that dds interest to the amount owed
        // double wintrestr = (Math.round(winterest*100)/100.0); this allows for the amount owed to be rounded to 2.d.p

        int start;
        System.out.println("how much did you owe at start of year? (enter without £ sign)");
        Scanner scanner;
        scanner = new Scanner(System.in);
        start = scanner.nextInt();

        System.out.println("how much did you pay off?");
        int paidoff;
        paidoff = scanner.nextInt();

        int newtotal;
        newtotal = (start - paidoff);

        System.out.println("your new total excluding interest is = ");
        System.out.println(newtotal);

        final double interest = 1.063;

        double winterest = (newtotal * interest);
        double wintrestr = (Math.round(winterest*100)/100.0);

        System.out.println("new total with interest = ");
        System.out.println(wintrestr);





    }
    }
