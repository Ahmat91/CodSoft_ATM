
package codsoftatminterface;

import java.util.HashMap;
import java.util.Map;


public class AtmOperationImplement implements AtmOperationInterface{
     ATM atm= new ATM();
     Map<Double,String> menustmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Your availale balance is " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
          if(withdrawAmount<=atm.getBalance()){
            menustmt.put(withdrawAmount," Amount withdrawn");
           System.out.println("Collect the Cash "+withdrawAmount);
           atm.setBalance(atm.getBalance()- withdrawAmount);
           viewBalance();
        }
        else{
            System.out.println(" Sorry your balance is insufficient !!");
        }        
        }
        else{
            System.out.println("Please enter amount in multiple 0f 100");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        menustmt.put(depositAmount," Amount deposited");
        System.out.println(depositAmount+ " Deposit successfully !!");
        atm.setBalance(atm.getBalance()+ depositAmount);
        viewBalance();
    }

    @Override
    public void viewMenu() {
        for(Map.Entry<Double,String> m:menustmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
    
}
