import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1;
        System.out.println("Digite as horas trabalhadas: ");
        n1 = entrada.nextFloat();
        n1 = (n1 * 10.25);
        if (n1 < 50) {
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        }
    }
}