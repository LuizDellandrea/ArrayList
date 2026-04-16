package Exemplos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TerceiroComCalculo {

    public static void main(String[] args) {

        ArrayList<Integer> terceirocalculo = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero diferente de 0: (0 para parar)");

        do {
            numero = input.nextInt();
            if (numero != 0) {
                terceirocalculo.add(numero);
            }
        } while (numero != 0);

        System.out.println(terceirocalculo);

        if (!terceirocalculo.isEmpty()) {

            int menor = Collections.min(terceirocalculo);
            System.out.println("Menor número: " + menor);

            int maior = Collections.max(terceirocalculo);
            System.out.println("Maior número: " + maior);

        
            double soma = 0;

            for (int i = 0; i < terceirocalculo.size(); i++) {
                soma += terceirocalculo.get(i);
            }

            double media = soma / terceirocalculo.size();
            System.out.println("Média: " + media);

        } else {
            System.out.println("Nenhum número foi digitado.");
        }
    }
}