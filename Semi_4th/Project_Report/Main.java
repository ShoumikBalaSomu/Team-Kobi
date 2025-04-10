package Semi_4th.Project_Report;
import Semi_4th.Project_Report.Hospital_Internal.Hospital_Internal;
import Semi_4th.Project_Report.Online.Online;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Hospital Management System");
        System.out.println("Choose the portal you want to enter: ");
        System.out.println("1. Hospital Internal Portal");
        System.out.println("2. Online Portal");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if(choice == 1){
            Hospital_Internal hospital_internal = new Hospital_Internal();
        }
        else if(choice == 2){
            Online online = new Online();
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}