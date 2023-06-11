package Hospital_Management;

import java.util.Scanner;

public class lab implements labInterface {
    String facility;
    int lab_cost;

    public void new_faci() {
        Scanner scn = new Scanner(System.in);
        System.out.print("facility:-");
        facility = scn.nextLine();
        System.out.print("cost:-");
        lab_cost = scn.nextInt();
    }

    public void facility_list() {
        System.out.println(facility + "\t\t" + lab_cost);
    }
}
