//Y Tran
//Tutorial 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declare variables
        boolean condition = false;
        double monthlyCharge = 0;
        char input = ' ';
        double deposit = 0;
        String name = "";
        //int transaction = 0;
        //welcome the user
        System.out.println("Welcome to Scout's Bank");
        System.out.println("This system is used to create bank accounts for you!");
        //prompt user's input
        while(condition == false) {
            System.out.print("Would you like to open a new bank account?(Y/N): ");
            input = scanner.next().charAt(0);
            input = Character.toUpperCase(input); //convert input to uppercase
            if ((input == 'Y')||(input == 'N')){
                condition = true; //ask the user till they answer Y or N
            }
        }
        //if the user answers Y
        if (input == 'Y'){

            System.out.print("How much do you want to deposit?: "); //ask for deposit amount
            deposit = scanner.nextDouble();
            //if deposit amount bigger than or equal to $100,000 then
            if (deposit >= 100_000){
                PrivilegedAccount newAccount= new PrivilegedAccount();; //create a privileged account
                newAccount.setAccountBalance(deposit);
                System.out.print("Enter your first and last name: "); //ask the user's name
                name = scanner.next().toUpperCase();
                name += scanner.nextLine().toUpperCase();

                newAccount.setOwnerName(name);
                System.out.print("How many transactions do you expect to make per month?: ");
                int transaction = scanner.nextInt();

                switch (transaction/30){
                    case 0: //if transactions < 30
                        newAccount.setMonthlyCharge(10); //charge 10
                        break;
                    default: //otherwise
                        newAccount.setMonthlyCharge(100); //charge 100
                }
                System.out.println("Account details" + newAccount.getDetails());
                }else if(deposit <0){
                System.out.println("Can't open an account with this number");
            } else { //if the deposit amount is less than $100,000
                NormalAccount newAccount = new NormalAccount();//create a normal account
                newAccount.setAccountBalance(deposit);
                System.out.print("Enter your first and last name: "); //ask the user's name
                name = scanner.next().toUpperCase(); //get all string input uppercase
                name += scanner.nextLine().toUpperCase();
                newAccount.setOwnerName(name);
                System.out.print("How many transactions do you expect to make per month?: ");
                int transaction = scanner.nextInt();

                switch (transaction/30){
                    case 0:
                        newAccount.setMonthlyCharge(10);
                        break;
                    default:
                        newAccount.setMonthlyCharge(100);
                }
                System.out.println("Account details" + newAccount.getDetails());
            }


        }else{ //if the user enters N meaning they don't want to create an account
            System.out.println("Okay. See you next time!"); //print this
            }

    }

}
