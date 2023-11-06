package Hospital_Management;

import javax.naming.AuthenticationException;
import java.util.*;
import java.io.*;

interface medicalInterface{
    void new_medi();
    void show_medi();
}
interface facilityInterface{
    void add_faci();
    void show_faci();
}
interface patientInterface{
    void newPatient();
    void patient_info();
}
interface labInterface{
    void new_faci();
    void facility_list();
}
interface staffInterface{
    void new_staff();
    void staff_info();
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password;

        try{
            System.out.println("Enter password : ");
            password=sc.nextLine();
            if(!password.equalsIgnoreCase("1234hospital"))
                throw new AuthenticationException("Incorrect password, Enter correct password");
            else
            {
                System.out.println("Welcome User !!!");

                int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
               
                System.out.println(" Welcome to Hospital Management System Project:");
                

                Doctor[] doctor=new Doctor[5];
                Patient[] patient = new Patient[10];
                lab[] l=new lab[2];
                Medical[] medi=new Medical[10];
                Staff[] staff=new Staff[10];
                Facility[] faci= new Facility[5];

                int i;
                for(i=0;i<5;i++)
                {
                    doctor[i]=new Doctor();
                }
                for(i=0;i<10;i++)
                {
                    patient[i]=new Patient();
                }
                for(i=0;i<2;i++)
                {
                    l[i]=new lab();
                }
                for(i=0;i<10;i++)
               {
                medi[i]=new Medical();
               }
                for(i=0;i<10;i++)
                {
                    staff[i]=new Staff();
                }
                for(i=0;i<5;i++)
               {
                faci[i]=new Facility();
               }

                int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
                while (status == 1) {
                    System.out.println("\nMAIN MENU");
                   
                    System.out.println("1. Doctors \n2. Patients \n3. Medicines \n4. Laboratories \n5. Facilities \n6. Staff \n7. Exit");
                    System.out.println();
                    choice =sc.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("DOCTOR SECTION");
                            s1 = 1;
                            while (s1 == 1) {
                                System.out.println("1.Add New Entry\n2.Existing Doctors List");
                                c1 = sc.nextInt();
                                switch (c1) {
                                    case 1: {
                                        doctor[count1].newDoctor();
                                        count1++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("id \t Name\t Specilialisation \t Room No.");
                                        for (j = 0; j < count1; j++) {
                                            doctor[j].doctorInfo();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nTo return Back Press 1 and for Main Menu Press 0");
                                s1 = sc.nextInt();
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("**PATIENT SECTION**");
                            s2 = 1;
                            while (s2 == 1) {
                                System.out.println("1.Add New Entry\n2.Existing Patients List");
                                c1 = sc.nextInt();
                                switch (c1) {
                                    case 1: {
                                        patient[count2].newPatient();
                                        count2++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                       
                                        for (j = 0; j < count2; j++) {
                                            patient[j].patient_info();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nTo Return Back Press 1 and for Main Menu Press 0");
                                s2 = sc.nextInt();
                            }
                            break;
                        }
                        case 3: {
                            s3 = 1;
                        
                            System.out.println("MEDICINE SECTION");
                            
                            while (s3 == 1) {
                                System.out.println("1.Add New Entry\n2. Existing Medicines List");
                                c1 = sc.nextInt();
                                switch (c1) {
                                    case 1: {
                                        medi[count3].new_medi();
                                        count3++;
                                        break;
                                    }
                                    case 2: {
                                       
                                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                                        
                                        for (j = 0; j < count3; j++) {
                                            medi[j].show_medi();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nTo Return Back Press 1 and for Main Menu Press 0");
                                s3 = sc.nextInt();
                            }
                            break;
                        }
                        case 4: {
                            s4 = 1;
                            
                            System.out.println("LABORATORY SECTION");
                            
                            while (s4 == 1) {
                                System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                                c1 = sc.nextInt();
                                switch (c1) {
                                    case 1: {
                                        l[count4].new_faci();
                                        count4++;
                                        break;
                                    }
                                    case 2: {
                                
                                        System.out.println("Facilities\t\t Cost");
                                
                                        for (j = 0; j < count4; j++) {
                                            l[j].facility_list();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nTo Return Back Press 1 and for Main Menu Press 0");
                                s4 = sc.nextInt();
                            }
                            break;
                        }
                        case 5: {
                            s5 = 1;
                        
                            System.out.println("          HOSPITAL FACILITY SECTION");
                            
                            while (s5 == 1) {
                                System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                                c1 = sc.nextInt();
                                switch (c1) {
                                    case 1: {
                                        faci[count5].add_faci();
                                        count5++;
                                        break;
                                    }
                                    case 2: {
                    
                                        System.out.println("Hospital  Facility are:");
                                       ;
                                        for (j = 0; j < count5; j++) {
                                            faci[j].show_faci();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nTo Return Back Press 1 and for Main Menu Press 0");
                                s5 = sc.nextInt();
                            }
                            break;
                        }
                        case 6: {
                            s6 = 1;
                           
                            System.out.println("                         STAFF SECTION");
                      
                            while (s6 == 1) {
                                String a = "nurse", b = "worker", c = "security";
                                System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                                c1 = sc.nextInt();
                                switch (c1) {
                                    case 1: {
                                        staff[count6].new_staff();
                                        count6++;
                                        break;
                                    }
                                    case 2: {
                                        
                                        System.out.println("id \t Name \t Gender \t Salary");
                                      
                                        for (j = 0; j < count6; j++) {
                                            if (a.equals(staff[j].desg))
                                                staff[j].staff_info();
                                        }
                                        break;
                                    }
                                    case 3: {
                                        
                                        System.out.println("id \t Name \t Gender \t Salary");
                        
                                        for (j = 0; j < count6; j++) {
                                            if (b.equals(staff[j].desg))
                                                staff[j].staff_info();
                                        }
                                        break;
                                    }
                                    case 4: {
                                        
                                        System.out.println("id \t Name \t Gender \t Salary");
                                 
                                        for (j = 0; j < count6; j++) {
                                            if (c.equals(staff[j].desg))
                                                staff[j].staff_info();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s6 = sc.nextInt();
                            }
                            break;
                        }
                        case 7: {
                            System.exit(0);
                        }

                        default: {
                            System.out.println(" You Have Entered Wrong Choice!!!");

                        }
                    }
                    System.out.println("\nTo Return to MAIN MENU Press 1");
                    status = sc.nextInt();
                }
            }
        }

        catch (AuthenticationException a) {
            a.printStackTrace();
        }
    }
}
