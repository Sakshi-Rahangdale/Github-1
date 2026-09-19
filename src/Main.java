import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO PAYPAL");
        System.out.println("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.println("Enter UPI ID: ");
        String upiId = sc.nextLine();

        System.out.println("Enter Amount: ");
        double amount = sc.nextDouble();

         Payment p1 = new Payment(customerName,upiId,amount);
        //  p1.displayPaymentDetails();
        
    }

   
}
