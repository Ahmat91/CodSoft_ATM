
package codsoftatminterface;

import java.util.Scanner;


public class CodSoftATMInterface {

    public static void main(String[] args) {
        AtmOperationInterface op = new AtmOperationImplement();
        Scanner scanner = new Scanner(System.in);
       
       int atmpin = 123;
        System.out.print("========== Welcome to ATM  Interface Machine ========= \n");
        System.out.print("Please enter your pin: ");
         int pin = scanner.nextInt();
        if(atmpin==pin){
            while(true){
             System.out.println("Please enter your choice");
             System.out.println("""
                                1. View available balance
                                2. Withdraw Amount
                                3. Deposit Amount
                                4. View Minu
                                5. Exit """);
             int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        op.depositAmount(depositAmount);
                        break;
                    case 4:
                        op.viewMenu();
                        break;
                    case 5:
                        System.out.print("Collect your ATM Cart\nThanks for using ATM Machine\n");
                        System.exit(0);
                    default:
                        System.out.println("Wrong choice !!!");
                        //break;
                }
            }
        }
        else{
            System.out.println("Incorrect atm pin");
            System.exit(0);
        }
    }
    
}
