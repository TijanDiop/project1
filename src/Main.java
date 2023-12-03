import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию через пробел:"+"\n"+"(Пример a + b)");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Результат: " + result);
        scanner.close();
    }
    public static String calc(String input) throws IllegalArgumentException {
        String[] strings;
        String space = " ";
        strings = input.split(space);
        if (strings.length != 3) {
            throw new IllegalArgumentException("Ошибка. Максимум два операнда и одно дейсвие");
        }
        int num1 = Integer.parseInt(strings[0]);
        int num2 = Integer.parseInt(strings[2]);
        String operation = strings[1];
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10){
            throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно");
        }
        int result;
        switch (operation) {
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                throw new UnsupportedOperationException("Неподдерживаемая операция: " + operation);
        }
        return String.valueOf(result);
    }
}
