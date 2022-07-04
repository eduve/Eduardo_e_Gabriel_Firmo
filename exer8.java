import javax.swing.JOptionPane;
import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer idade;
        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();
        if (idade <= 3) {
            JOptionPane.showMessageDialog(null, "É bebe");
        }
        if ((idade >= 4) && (idade <= 9)) {
            JOptionPane.showMessageDialog(null, "É criança");
        }
        if ((idade >= 10) && (idade <= 13)) {
            JOptionPane.showMessageDialog(null, "É pré-adolescente");
        }
        if ((idade >= 14) && (idade <= 17)) {
            JOptionPane.showMessageDialog(null, "É adolescente");
        }
        if ((idade >= 18) && (idade <= 25)) {
            JOptionPane.showMessageDialog(null, "É jovem adulto");
        }
        if ((idade >= 26) && (idade <= 50)) {
            JOptionPane.showMessageDialog(null, "É adulto");
        }
        if ((idade >= 51) && (idade <= 65)) {
            JOptionPane.showMessageDialog(null, "É senhor de idade");
        }
        if (idade >= 66) {
            JOptionPane.showMessageDialog(null, "É velho");
        }

    }
}
