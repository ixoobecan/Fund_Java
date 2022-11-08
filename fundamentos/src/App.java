import java.util.Scanner;
import java.lang;

public class App {
    public static void main(String[] args){
        try (Scanner user = new Scanner(System.in)) {
            String nome = user.nextLine();
            float sal = user.nextFloat();
            System.out.format("o salario de %s é %f", nome, sal);
        }
    }
}
public class Soma{
    int n1 = Integer.parseInt(txtN1.getText());
    int n2 = Integer.parseInt(txtN2.getText());
    int soma = n1 + n2;
    Soma.setText(Integer.toString(soma));
}
