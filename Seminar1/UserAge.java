import java.util.Scanner;

public class UserAge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите ваш возраст: ");

    try {
      int age = Integer.parseInt(sc.next());
      System.out.println("Ваш возраст: " + age);
    } catch (NumberFormatException e) {
      System.out.println("Некорректный ввод");
    }
    sc.close();
  }
}