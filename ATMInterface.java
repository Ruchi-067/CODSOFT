import java.util.Scanner;

public class ATMInterface {
    private static double balance=1000.00;
    private static Scanner scanner=new Scanner(System.in);

    public static void checkBalance(){
        System.out.printf("Your current balance is: $%2f\n", balance);
    }
    public static void depositMoney(){
        System.out.println("Enter amount to deposit:");
        double amount=scanner.nextDouble();
        if(amount>0){
            balance +=amount;
            System.out.printf("Succesfully deposited $:2f\n", amount);
        }else {
            System.out.println("Invalid amount.Please try again.");
        }
        checkBalance();
        }
        public static void withdrawMoney(){
            System.out.println("Enter amount to withdraw:");
            double amount=scanner.nextDouble();
            if(amount>0 && amount <=balance){
                balance +=amount;
                System.out.printf("Succesfully deposited $:2f\n", amount);
            }else {
                System.out.println("Invalid amount or insufficient balance.Please try again.");
            }
            checkBalance();

        }
        public static void showMenu(){
            System.out.println("\nATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
        }
        public static void main(String[] args) {
            while (true) { 
                showMenu();
                System.out.print("Please choose an option:");
                int choice=scanner.nextInt();

                switch(choice){
                    case 1:
                    checkBalance();
                    break;
                    case 2:
                    depositMoney();
                    break;
                    case 3:
                    withdrawMoney();
                    break;
                    case 4:
                    System.out.println("Thank you for using out ATM.Goodbye");
                    scanner.close();
                    System.exit(0);
                    default:
                    System.out.println("Invalid choice.Please try again.");
                }
                
            }}
        }
    

