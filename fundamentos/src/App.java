import java.util.Scanner;
import java.lang;

public class App {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        String nome = user.nextLine();
        float sal = user.nextFloat();
        System.out.format("o salario de %s é %f", nome, sal);
    }
}
