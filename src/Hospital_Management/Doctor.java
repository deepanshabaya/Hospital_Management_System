package Hospital_Management;

import java.util.*;
public class Doctor {
    String dctr_id , dctr_name, specialisation;
    int droom;
    Scanner sc=new Scanner(System.in);
    void newDoctor(){
        System.out.println("Enter id: ");
        dctr_id = sc.nextLine();
        System.out.println("Enter name: ");
        dctr_name = sc.nextLine();
        System.out.println("Enter specialisation: ");
        specialisation = sc.nextLine();
        System.out.println("Enter room no.: ");
        droom = sc.nextInt();
    }

    void doctorInfo(){
        System.out.println("ID: "+ dctr_id + " Name : " + dctr_name + "Specialisation: " +specialisation + "Room no.:" + droom);
    }
}
