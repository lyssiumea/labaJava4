import java.util.Scanner;

public class Main {     // Вариант 8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.1. Обобщенная коробка.
        System.out.print("Введите целое число для хранения в коробке: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: требуется ввести целое число.");
            scanner.next();
        }
        int value = scanner.nextInt();

        Box<Integer> integerBox = new Box<>();
        try {
            integerBox.put(value);
            System.out.println(integerBox); // содержимое коробки
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("Извлечение значения из коробки...");
        Integer extractedValue = integerBox.get();
        System.out.println("Извлечённое значение: " + extractedValue);
        System.out.println(integerBox); // проаерка на пустоту коробки
    }
}