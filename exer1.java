import java.util.Scanner;

public class exer1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int h,b,B,area;
        System.out.println("Digite a altura do trapésio: ");
        h = entrada.nextInt();
        System.out.println("Digite a base menor do trapésio: ");
        b = entrada.nextInt();
        System.out.println("Digite a base maior do trapésio: ");
        B = entrada.nextInt();
        area = (h*(b+B))/2;
        System.out.println("A área do  trapésio é: " + area);
    }
}
