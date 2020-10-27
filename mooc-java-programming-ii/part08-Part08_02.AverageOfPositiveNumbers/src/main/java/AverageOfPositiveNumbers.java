
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPositive = 0;
        int numPositive = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                totalPositive += num;
                numPositive += 1;
            }
        }
        
        if (totalPositive == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = (double) totalPositive / numPositive;
            
            System.out.println(avg);
        }
    }
}
