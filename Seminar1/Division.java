import java.util.Scanner;

public class Division {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    int num1 = sc.nextInt();
    System.out.print("Введите второе число: ");
    int num2 = sc.nextInt();

    try {
      int result = num1 / num2;
      System.out.println("Результат: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Деление на ноль недопустимо");
    }
  }
}