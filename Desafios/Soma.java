package Desafio3;

public class Soma {
    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println("A soma é " + soma);
    }
}
