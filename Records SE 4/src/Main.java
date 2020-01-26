//Records, 02/10/18 Sean Palmer
import java.util.Scanner;
import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        printQues();
        scan();


    }

    public static void printQues() {
        System.out.println("What room are you in?");
    }

    public static void scan() {
        musemObject one = new musemObject();
        one.name = "fatberg";
        one.description = "lump of sewage";
        one.year = "2017";

        musemObject two = new musemObject();
        two.name = "roman mosaic";
        two.description = "tessarae";
        two.year = "150";

        musemObject three = new musemObject();
        three.name = "Medieval London Bridge";
        three.description = "Model";
        three.year = "990";

        Scanner scan1 = new Scanner(System.in);
        String roomN = scan1.nextLine();
        roomN = roomN.toUpperCase();
        if

        (roomN.equals("B"))
            System.out.println("The main item in this room is the " + one.name + "\n It dates from the year " + one.year + ".\n A fatberg is a congealed " + one.description + " This one was 250-metre-long,\n weighing over 140 tonnes found under Whitechapel, London. ");

        else if (roomN.equals("A"))
            System.out.println("What room are you in? A\n The main item in this room is the " + two.name + ".\n It dates from the year " + two.year + ".\n It is made of " + two.description + " - small cubes of different coloured stone that\n together make up a picture, here of a star. ");
        else if (roomN.equals("C"))
            System.out.println("What room are you in? C\n The main item in this room is the " + three.description + " of the " + three.name + "\n It dates from the year " + three.year + " King Cnut found it so well defended that he dug a channel around it so his boats could go past.");
        else if (roomN.equals("D"))
            System.out.println("What room are you in? D\n I am sorry that is not a room that is open to the public. ");


        int yesNo = JOptionPane.showConfirmDialog(null, "are you in a new room yet?");
        if (yesNo == 1) ;
        printQues();
        scan();
    }



    }
    class musemObject {
    String name;
    String year;
    String description;
    }










