import java.util.Scanner;

public class hometask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        boolean result;
        int c = a+b;
        if (10 <= c && c <= 20){
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
    }
}
