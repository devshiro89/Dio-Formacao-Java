package edu.dioformacaojava.modulo1.rawstudies;
import java.util.Scanner;
import java.util.Locale;
public class ArgumentsTerminalsScanner {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o nome da CPU: ");
        String nomeCPU = scanner.nextLine();

        System.out.print("Digite a cidade natal: ");
        String cityBorn = scanner.nextLine();

        System.out.print("Digite o share: ");
        int share = scanner.nextInt();

        System.out.print("Digite o ataque: ");
        double attack = scanner.nextDouble();

        System.out.printf("CPU: %s, Cidade Natal: %s, Share: %d, Ataque: %.2f", nomeCPU, cityBorn, share, attack);
        System.out.println();
        scanner.close();
    }
}
