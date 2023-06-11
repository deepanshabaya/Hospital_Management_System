package Hospital_Management;

import java.util.Scanner;

public class Facility implements facilityInterface {
    String fac_name;

    public void add_faci() {
        Scanner scn = new Scanner(System.in);
        System.out.print("facility:-");
        fac_name = scn.nextLine();
    }

    public void show_faci() {
        System.out.println(fac_name);
    }
}