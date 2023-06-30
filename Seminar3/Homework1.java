import java.util.InputMismatchException;
import java.util.Scanner;


public class Homework1 {
    public static void main(String[] args) {
        
        try {
            double base = getDouble("Введите основание: ");
            double exponent = getDouble("Введите степень: ");

            System.out.println("Результат: " + PowerCalculator.calculatePower(base, exponent));
        } catch (InvalidInputException ex) {
            System.out.println(ex.getMessage());
        }
    
     }


    public static double getDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка: Введено некорректное значение. Повторите ввод.");
                scanner.next(); // Очистка буфера сканера
            } 
        }
        
    }
}    

class PowerCalculator {
    public static double calculatePower(double base, double exponent) throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException(
                "Некорректный ввод: 0 не возводится в отрицательную степень!");
        }
        return Math.pow(base, exponent);
    }
}


class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

