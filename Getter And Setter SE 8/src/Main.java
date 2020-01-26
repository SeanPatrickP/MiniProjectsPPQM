// Sean Palmer Short Exercise 8 Getter and Setter 30/10/18

import java.util.Scanner;
public class Main {
    public static void main(String [] param) {

//we store the known stations in an array along with the zone and boolean response, this is then passed into the separate setter methods
        String[] sName = {"Bristol", "York", "Reading"};
        int [] sZone = {1,1,2};
        boolean [] sFree = {false,true,true};
        Stations [] stationArray = new Stations[3];
        for(int i = 0 ; i<3; i++) {
            // below we need to actually create the record within the array otherwise the record within the array won't exist
            stationArray[i] = new Stations();

            stationArray[i].free = setFree(stationArray[i], sFree [i]);
            stationArray[i].name = setName(stationArray[i], sName[i]);
            stationArray[i].zone = setZone(stationArray[i], sZone[i]);


        }
// below is the evaluation part where the conditions are evaluated to return a response to the user input
        System.out.println("what station do you need to know about?");
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();
        for(int i=0; i<3 ; i++){
            if(response.equals(stationArray[i].name)) {
                int zone = getZone(stationArray[i].zone);
                if(zone == 1)
                    System.out.println("Great Western");
                if(zone == 2)
                    System.out.println("Great Eastern");

                if(stationArray[i].free == true)
                    System.out.println("step free");

                if(stationArray[i].free == false)
                    System.out.println("not step free");
            }
        }
        if(!response.equals( "Bristol" ) && !response.equals( "York" ) && !response.equals( "Reading" ))
            System.out.println("havent heard of that");




    }

    public static boolean setFree (Stations temp, boolean sFree){

        temp.free = sFree;



        return temp.free;
    }

    public static String setName (Stations temp, String sName){


        temp.name = sName;



        return temp.name;
    }

    public static int setZone (Stations temp, int sZone){


        temp.zone = sZone;


        return temp.zone;
    }

// this getter method returns the zone that is then evaluated with the if statements in the main
    public static int getZone(int zone){

        return zone;
    }

}



class Stations{
    String name;
    int zone;
    boolean free;


}