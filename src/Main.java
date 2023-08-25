public class Main {
    public static void main(String[] args) {
        String input = "2 + 2";
        String result = calc(input);
        System.out.println("Результат: " + result);
    }

    public static String calc(String input) {
        String[] tokens = input.split(" ");
        if (tokens.length != 3) {
            return "Ошибка: некорректное выражение";
        }

        double num1;
        double num2;
        try {
            num1 = Double.parseDouble(tokens[0]);
            num2 = Double.parseDouble(tokens[2]);
        } catch (NumberFormatException e) {
            return "Ошибка: некорректные числа";
        }

        char operator = tokens[1].charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    return "Ошибка: деление на ноль";
                }
                break;
            default:
                return "Ошибка: некорректный оператор";
        }

        return Double.toString(result);
    }
}
