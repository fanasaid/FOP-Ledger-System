
package assignment;
import java.util.Scanner;
public class LOGOUT {
    public static String name;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("== Transaction Menu ==");
            System.out.println("1. Debit");
            System.out.println("2. Credit");
            System.out.println("3. History");
            System.out.println("4. Savings");
            System.out.println("5. Credit Loan");
            System.out.println("6. Deposit Interst Predictor");
            System.out.println("7. Logout");
            
            choice = sc.nextInt();
            
            switch (choice){
                case 1: 
                    // handle option 1
                case 2:
                    // handle option 2
                case 3:
                    // handle option 3
                case 4:
                    // handle option 4
                case 5:
                    // handle option 5
                case 6: 
                    // handle option 6
                case 7:
                    logout();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
        } while (choice != 7); //continue loop until logout
    }    
    public static void logout() {
        // clear the user name session
        name = null; // set the current user name to null
        System.out.println("Thank you for using Ledger System");
            
        
        
    }

}









