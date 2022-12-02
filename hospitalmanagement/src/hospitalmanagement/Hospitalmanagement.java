
package hospitalmanagement;
import java.util.Scanner;

public class Hospitalmanagement {
    static Scanner sc = new Scanner(System.in);                          // MADE IT STATIC SO THAT IT CAN BE ACCESSED FROM MAIN METHODE
    public static void main(String[] args) {
        
        System.out.println("-----------------------------------------");
        System.out.println("|       HOSPITAL MANAGEMENT SYSTEM      |");
        System.out.println("-----------------------------------------");
        
        System.out.println("\n                                    MAIN MENU");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("1. Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
        System.out.println("-----------------------------------------------------------------------------------");
        
        int option;
        System.out.println("OPTION : ");
        option = sc.nextInt();
        
        Facility f = new Facility();
        
        if(option==5){
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-----------------------------HOSPITAL FACILITIES-------------------------------");
            System.out.println("-------------------------------------------------------------------------------");
            
            
            while(true){
                System.out.println("1. Add new Facility \n2. Current Facilities List");
                int foption=0;
                foption = sc.nextInt();
                if(foption==1){
                    f.setdata();
                }
                else{
                    f.getdata();
                }
            }
            
        }
        
        
    }
    
    
    
}
