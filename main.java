import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber, secondNumber;
        String operator;

        System.out.println("Calculadora em Java");
        System.out.println("Digite 'sair' para cancelar");

        while (true) {
            System.out.print("Coloque a expressão matemática (ex. 1 + 2): ");
            firstNumber = scanner.nextDouble();
            operator = scanner.next();
            secondNumber = scanner.nextDouble();

            if (operator.equals("sair")) {
                break;
            }

            switch (operator) {
                case "+":
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case "-":
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case "*":
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("Não foi possível dividir por 0.");
                    } else {
                        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    }
                    break;
                default:
                    System.out.println("Operador não encontrado po");
            }
        }
        scanner.close();
    }
}
