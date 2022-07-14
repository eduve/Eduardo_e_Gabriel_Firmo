import java.util.Scanner;
public class exer10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float p,a,imc;
        System.out.println("Digite o seu peso: ");
        p = entrada.nextFloat();
        System.out.println("Digite a sua altura(m): ");
        a = entrada.nextFloat();
        imc = (p/(a*a));
        if (imc < 18.5){
            System.out.println("Seu imc é " + imc + " e a categoria é peso abaixo do normal");
        }

        if ((imc >= 18.5) && (imc <= 24.4)){
            System.out.println("Seu imc é " + imc + " e a categoria é peso ideal");
        }

        if ((imc >= 24.5) && (imc <= 29.9)){
            System.out.println("Seu imc é " + imc + " e a categoria é pré-obesidade");
        }

        if ((imc >= 30) && (imc <= 34.9)){
            System.out.println("Seu imc é " + imc + " e a categoria é obesidade classe 1");
        }

        if ((imc >= 35) && (imc <= 39.9)){
            System.out.println("Seu imc é " + imc + " e a categoria é obesidade severa");
        }

        if (imc >= 40){
            System.out.println("Seu imc é " + imc + " e a categoria é obesidade mórbida");
        }
    }
}
