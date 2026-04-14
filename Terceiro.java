import java.util.ArrayList;
import java.util.Scanner;

public class Terceiro {
    
    public static void main(String[] args) {

        ArrayList<Integer> terceiro = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero diferente de 0: ( 0 para parar ");

        do {
            numero = input.nextInt();
            if (numero != 0) {
                terceiro.add(numero);
            }
        } while (numero != 0);

        System.out.println(terceiro);
    }
}