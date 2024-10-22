import java.util.Scanner;

public class CurrencyConverter {
    public static double convertCurrency(double amount, double exchangesRate){
        return amount* exchangesRate;
     }
     public static void main(String[] args) {
         Scanner scanner=new Scanner (System.in);
         System.out.println("Welcome to the Currency Converter");
         System.out.println("1. USD to EUR");
         System.out.println("2. EUR to USD");
         System.out.println("3. USD to GBP");
         System.out.println("4. GBP to USD");
         System.out.println("5. USD to JPY");
         System.out.println("6. JPY to USD");
         
         int choice=scanner.nextInt();
         double exchangeRate=0;

         switch (choice){
            case 1:
              exchangeRate=0.85;
              System.out.println("You chose USD to EUR");
               break;
             case 2:
               exchangeRate=1.18;
               System.out.println("You chose EUR to USD");
                break;
             case 3:
                exchangeRate=0.73;
                System.out.println("You chose USD to GBP");
                 break;
             case 4:
                 exchangeRate=1.36;
                 System.out.println("You chose GBP to USD");
                  break;
             case 5:
                  exchangeRate=110.85;
                  System.out.println("You chose USD to JPY");
                   break;
             case 6:
                   exchangeRate=0.85;
                   System.out.println("You chose JPY to USD");
                    break;
                    default:
                    System.out.println("Invalid choice");
                    System.exit(0);
         }
         System.out.println("Enter the amount you want to convert:");
         double amount=scanner.nextDouble();

         double convertedAmount=convertCurrency(amount,exchangeRate);
         System.out.printf("Converted amount:%.2f\n",convertedAmount);

         scanner.close();

     }
        
    }

    

