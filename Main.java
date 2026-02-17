import java.util.Scanner;

public class Main {
    public static void Calculadora() {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n ---Bem vindo a Calculadora--- \n");
            System.out.println("Escolha uma operação: \n");

            System.out.println("1.Soma");
            System.out.println("2.Subtração");
            System.out.println("3.Multiplicação");
            System.out.println("4.Divisão \n");

            System.out.println("Digite o numero da operação escolhida: ");

            while (!sc.hasNextInt()) {
                System.out.println("Digite um numero valido!");
                sc.next();
            }
            int operacao = sc.nextInt();

            while (operacao > 4) {
                System.out.println("Digite o numero de uma operação!");
                try {
                    operacao = sc.nextInt();
                } catch (Exception e) {
                    sc.next();
                }
            }

            System.out.println("\nDigite o primeiro numero: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Digite um numero valido!");
                sc.next();
            }
            double num1 = sc.nextDouble();

            System.out.println("\nDigite o segundo numero: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Digite um numero valido!");
                sc.next();
            }
            double num2 = sc.nextDouble();            

            switch (operacao) {
                case 1 -> System.out.println("\nO resultado da soma é: " + Soma(num1, num2) + "\n");
                case 2 -> System.out.println("\nO resultado da subtração é: " + Subtracao(num1, num2) + "\n");
                case 3 -> System.out.println("\nO resultado da multiplicação é: " + Multiplicacao(num1, num2) + "\n");
                case 4 -> System.out.println("\nO resultado da divisão é: " + Divisao(num1, num2) + "\n");
                default -> {
                }
            }

            System.out.println("Deseja realizar outra operação?\n\n1.Sim \n2.Nao");
            while (!sc.hasNextInt()) {
                System.out.println("Digite um numero valido!");
                sc.next();
            }
            int opcao = sc.nextInt();

            if (opcao == 1) {
                Calculadora();
            } else if (opcao == 2) {
                System.out.println("\n ---Obrigado por utilizar a Calculadora!--- \n");
            }
        }
    }

    public static double Soma(double x, double y) {
        return x + y;
    }

    public static double Subtracao(double x, double y) {
        return x - y;
    }

    public static double Multiplicacao(double x, double y) {
        return x * y;
    }

    public static double Divisao(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println("Versão do Java: " + System.getProperty("java.version"));
        Calculadora();
    }
}
