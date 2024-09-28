package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class atmOperationImp implements AtmInterface{
    Atm atm = new Atm();
    Map<Double,String> ministmt = new HashMap<>();
    public void viewBalance() {

        System.out.println("Available balance: " + atm.getBalance());

    }

    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 500 ==0) {
            if (withdrawAmount <= atm.getBalance()) {
                System.out.println("collect the cash");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                ministmt.put(withdrawAmount,  "withdraw");
                viewBalance();

            } else {
                System.out.println("Insufficient balance");
            }
        }
            else{
                System.out.println("Enter interms of 500");

        }


    }

    public void depositAmount(double depositAmount) {
        System.out.println("deposited amount: "+ depositAmount);
        atm.setBalance(atm.getBalance() + depositAmount);
        ministmt.put(depositAmount, "deposited");
        viewBalance();


    }

    public void viewMiniStatement() {
        Set<Double> set = ministmt.keySet();
        for(Double d : set) {
            System.out.println(d + " = "+ ministmt.get(d));
        }

    }
}
