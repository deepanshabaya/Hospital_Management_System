package Hospital_Management;

import java.util.*;
public class Patient implements patientInterface{
    String patient_id,patient_name,gender,admit_status,disease;
    int age;
    public void newPatient(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter id:-");
        patient_id = sc.nextLine();
        System.out.print("name:-");
        patient_name = sc.nextLine();
        System.out.print("disease:-");
        disease = sc.nextLine();
        System.out.print("Gender:-");
        gender = sc.nextLine();
        System.out.print("admit_status:-");
        admit_status = sc.nextLine();
        System.out.print("age:-");
        age = sc.nextInt();
    }

    public void patient_info()
    {
        System.out.println("ID: " + patient_id+ "\t" + "Patient name: " + patient_name + " \t" + "Disease: "+ disease + "     \t" + "Gender: " +gender + "      \t" + "admit_status: " +  admit_status + "\t" + "Age: " + age);
    }
}
