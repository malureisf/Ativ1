import java.util.Scanner;

public class Ativ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sensores = new double[5];
        double soma = 0;

        // Entrada de dados
        for (int i = 0; i < sensores.length; i++) {
            System.out.print("Digite a temperatura do sensor " + (i + 1) + ": ");
            sensores[i] = sc.nextDouble();
            soma += sensores[i];
        }

        // Exibir temperaturas
        System.out.println("\nTemperaturas digitadas:");
        for (int i = 0; i < sensores.length; i++) {
            System.out.println("Sensor " + (i + 1) + ": " + sensores[i]);
        }

        // Média
        double media = soma / sensores.length;
        System.out.println("\nMédia das temperaturas: " + media);

        sc.close();
    }
}
    
