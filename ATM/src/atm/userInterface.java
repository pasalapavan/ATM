package atm;

import java.util.Scanner;

public class userInterface {
    static atmOperationImp ao = new atmOperationImp();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int pin =7876;
        System.out.println("Welcome to the ATM ");
        System.out.println("Enter Atm Pin");
        int usrPin=sc.nextInt();
        if(usrPin==pin){
            System.out.println("You have entered the ATM");
            while(true){
                System.out.println("1.view balance\n 2.withdraw balance\n 3.deposit\n 4.viewStatement\n 5.exit");
                System.out.println("Enter your choice");
                int choice=sc.nextInt();
                if(choice==1){
                    ao.viewBalance();
                }
                else if(choice==2){
                    double withdrawAmount=sc.nextDouble();
                    ao.withdrawAmount(withdrawAmount);
                }
                else if(choice==3){
                    System.out.println("enter the amount");
                    double depositAmount=sc.nextDouble();
                    ao.depositAmount(depositAmount);
                }
                else if(choice==4){
                    ao.viewMiniStatement();
                }
                else if(choice==5){
                    System.out.println("Thank you for using the ATM");
                    System.exit(0);
                }



            }


            }
        else{
            System.out.println("Wrong pin");
        }





    }

    }


