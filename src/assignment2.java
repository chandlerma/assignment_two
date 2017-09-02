import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 0;
        int i;

        System.out.println("please enter your monthly saving amount");
        double monthlyS = scan.nextDouble();

        for (i = 1; i <7; i++){
            balance = (balance + monthlyS) * (1 + 0.00417) ;
        }
        System.out.println("your saving after 6 months will be " + balance);
    }
}
