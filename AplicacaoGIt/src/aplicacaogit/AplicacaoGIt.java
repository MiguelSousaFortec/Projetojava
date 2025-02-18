package aplicacaogit;
import java.util.Scanner;
public class AplicacaoGIt {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Meu primeiro programa "
                + "versionado com git e hospedado no GitHub!");
        System.out.println("Digite o primeiro valor: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = scan.nextInt();
        System.out.println("O resultado da soma é: " + (num1+num2));
    }
    
}
