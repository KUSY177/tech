import java.util.Scanner;

public class Converter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double metersToKilometers(double m) {
        return m / 1000.0;
    }

    public static double kilogramsToGrams(double kg) {
        return kg * 1000.0;
    }

    public static double gramsToKilograms(double g) {
        return g / 1000.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Конвертер единиц ===");
            System.out.println("1. Цельсий → Фаренгейт");
            System.out.println("2. Фаренгейт → Цельсий");
            System.out.println("3. Метры → Километры");
            System.out.println("4. Килограммы → Граммы");
            System.out.println("5. Граммы → Килограммы");
            System.out.println("0. Выход");
            System.out.print("Выберите операцию: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Выход из программы.");
                break;
            }

            try {
                System.out.print("Введите значение: ");
                double value = Double.parseDouble(scanner.nextLine());

                switch (choice) {
                    case "1":
                        System.out.println("Результат: " + celsiusToFahrenheit(value) + " °F");
                        break;
                    case "2":
                        System.out.println("Результат: " + fahrenheitToCelsius(value) + " °C");
                        break;
                    case "3":
                        System.out.println("Результат: " + metersToKilometers(value) + " км");
                        break;
                    case "4":
                        System.out.println("Результат: " + kilogramsToGrams(value) + " г");
                        break;
                    case "5":
                        System.out.println("Результат: " + gramsToKilograms(value) + " кг");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: нужно ввести число.");
            }
        }

        scanner.close();
    }
}
