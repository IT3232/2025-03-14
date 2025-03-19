import java.util.Scanner;

public class ReverseHalves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int mid = n / 2;

        
        for (int i = mid; i >= 1; i--) {
            System.out.print(i + " ");
        }

    
        if (n % 2 != 0) {
            System.out.print((mid + 1) + " ");
        }

        
        for (int i = n; i > mid + (n % 2); i--) {
            System.out.print(i + " ");
        }
    }
}
