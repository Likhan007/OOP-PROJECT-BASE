
package hospitalmanagement;
import java.util.Scanner;

public class Facility {
    int fnum=0;

    
    static Scanner sc = new Scanner(System.in);
    private String[] datas = new String[20];
    
                //      HARDCODED PART      //
//    datas[0]="X-RAY";
//    datas[1]="Ambulance";             //KAJ KORTESENA KENO JANI. PORE DEKHBO
//    datas[2]="Emergency";
    
    public void setdata(){
        
        System.out.println("New Facility Name: ");
        datas[fnum] = sc.nextLine();
        System.out.println("\n\n");
        fnum=fnum+1;
    }
    
    public void getdata(){
        int getnum;
        
        System.out.println("\n\n");
        for(getnum=0 ; getnum<fnum ; getnum++)
        {
            System.out.println((getnum+1)+ ". " +datas[getnum]);
        }
        System.out.println("\n\n");
    }
}
