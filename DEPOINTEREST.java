
package assignment;
import java.util.Scanner;
public class DEPOINTEREST {
    public static void main(String[] args){
        
        //assume the user selects choice '6' which is deposit interest predictor
        Scanner sc = new Scanner(System.in);
        
        //bank interest rates
        double rhbRate = 2.6;
        double maybankRate = 2.5;
        double hongLeongRate = 2.3;
        double allianceRate = 2.85;
        double amBankRate = 2.55;
        double standardCharteredRate = 2.65;
        
        System.out.println("== Deposit Interest Predictor ==");
        System.out.printf("Your current Account Balance: %.2f%n", accountBalance); // aligned with the variable account balance 
        
        System.out.println("\nChoose your bank:");
        System.out.println("1. RHB (2.6%)");
        System.out.println("2. Maybank (2.5%)");
        System.out.println("3. Hong Leong (2.3%)");
        System.out.println("4. Alliance (2.85%)");
        System.out.println("5. AmBank (2.55)");
        System.out.println("6. Standard Chartered (2.65%)");
        
        System.out.print("Enter your choice (1-6): ");
        int bankChoice = sc.nextInt();
        double interestRate = 0;
        
        switch (bankChoice){
            case 1 -> interestRate = rhbRate;
            case 2 -> interestRate = maybankRate;
            case 3 -> interestRate = hongLeongRate;
            case 4 -> interestRate = allianceRate;
            case 5 -> interestRate = amBankRate;
            case 6 -> interestRate = standardCharteredRate;
            default -> {
                System.out.println("Invalid choice. Please select a valid bank.");
                return;
            }
        }
        
        // to calculate monthly interest
        double monthlyInterest = (accountBalance * interestRate)/12/100;
        System.out.printf("Estimated Monthly Interest: %.2f%n", monthlyInterest);        
               
    }
}

    
