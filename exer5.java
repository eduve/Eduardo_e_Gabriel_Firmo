import java.util.Scanner;

public class exer5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int primos, n, i, cont = 0;
    System.out.println("Digite um número: ");
    n = entrada.nextInt();
    for (i = 1; i <= n; i++) {
      if (n % 1 == 0 && n % i == 0)
        cont++;

    }
    if (cont == 2) {
      System.out.println("O numero é primo");
    } else {
      System.out.println("O numero não é primo");
    }
  }
}
