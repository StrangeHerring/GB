import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();
        System.out.println("Введите d");
        int d = scanner.nextInt();
        int x = a*(b+(c/d));
        System.out.println("Результат: " + x);
    }
}
