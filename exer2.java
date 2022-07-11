import java.util.Scanner;

public class exer2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double h, b, B, area;
        System.out.println("Digite a altura do trapésio: ");
        h = entrada.nextDouble();
        System.out.println("Digite a base menor do trapésio: ");
        b = entrada.nextDouble();
        System.out.println("Digite a base maior do trapésio: ");
        B = entrada.nextDouble();
        area = (h * (b + B)) / 2;
        System.out.println("A área exata do trapésio é: " + area);
        System.out.println("A área arredondada do trapésio é: " + Math.ceil(area));
    }
}
