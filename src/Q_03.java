import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        int rows;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter rows in the pyramid :");
        rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++){

            System.out.println(" ");

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

        }

    }
}
