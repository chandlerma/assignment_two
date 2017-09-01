import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double monthlyS;
        int i;

        System.out.println("please enter your monthly saving amount");
        monthlyS = scan.nextDouble();

        for (i = 1; i <6; i++){
            monthlyS = monthlyS * (1 + 0.00417) ;
            System.out.println(monthlyS);
        }
    }
}