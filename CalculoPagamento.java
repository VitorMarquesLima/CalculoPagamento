import java.util.Scanner;

public class CalculoPagamento {
    public static void main(String[] args) {

               //Abrir o método Scanner
        Scanner scanner = new Scanner(System.in);

               // Solicita o valor-hora do funcionário
        System.out.print("Digite o valor-hora do funcionário: ");
        double valorHora = Double.parseDouble(scanner.nextLine());


               // Solicita o número de dias trabalhados no mês
        System.out.print("Digite o número de dias trabalhados no mês: ");
        int diasTrabalhados = Integer.parseInt(scanner.nextLine());


               // Solicita o número de horas trabalhadas por dia
        System.out.print("Digite o número de horas trabalhadas por dia: ");
        int horasPorDia = Integer.parseInt(scanner.nextLine());

               //Fecha o método Scanner
        scanner.close();


               // Calcula o valor que será pago ao funcionário
        double salario = valorHora * diasTrabalhados * horasPorDia;


               // Exibe o valor a ser pago
        System.out.println("O valor que será pago ao funcionário é: R$" + salario);
    }
}