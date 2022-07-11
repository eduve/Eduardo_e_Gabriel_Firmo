import java.util.Scanner;
public class exer8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n,n1,n2;
        System.out.println("Digite o numero: ");
        n = entrada.nextFloat();
        n1 = (n * 1000);
        n1 = (n1 / 454);
        System.out.println("Se for conversão para libras o valor é de: " + n1);
        n2 = (n * 454);
        n2 = (n2 / 1000);
        System.out.println("Se for conversão para quilos o valor é de: " + n2);
    } 
}

