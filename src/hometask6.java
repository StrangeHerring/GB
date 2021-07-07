import java.util.Scanner;

public class hometask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        if (a < 0) System.out.println(true);
        else {
            System.out.println(false);
        }
    }
}
