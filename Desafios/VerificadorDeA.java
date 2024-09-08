package Desafio2;

public class VerificadorDeA {
    private String teste = "Esta é uma string teste";
    public void verificador(String teste) {
        char maiscula = 'A';
        char minuscula = 'a';
        int contador = 0;

        for (int i = 0; i < teste.length(); i++) {
            char letra = teste.charAt(i);
            if (letra == maiscula || letra == minuscula) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("A letra 'A' ou 'a' aparece " + contador + " vezes");
        } else {
            System.out.println("A letra não aparece nenhuma vez");
        }
    }

    public static void main(String[] args) {
        VerificadorDeA executar = new VerificadorDeA();
        executar.verificador(executar.teste);
    }
}
