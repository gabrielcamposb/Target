package Desafio1;

public class SequenciaFibonacci {
    private int numero = 5;
    public void verificarNumero(int numero) {
        if (numero < 0) {
            System.out.print("O número não pertence à sequência de Fibonacci");
        }
        if (numero == 0) {
            System.out.println("O número pertence à sequência de Fibonacci");
        }
        if (numero > 0) {
            int a = 0;
            int b = 1;
            while (b < numero) {
                int c = a + b;
                a = b;
                b = c;
            }
            if (b == numero) {
                System.out.println("O número pertence à sequência de Fibonacci");
            } else {
                System.out.println("O número não pertence à sequência de Fibonacci");
            }
        }
    }

    public static void main(String[] args) {
        SequenciaFibonacci executar = new SequenciaFibonacci();
        executar.verificarNumero(executar.numero);
    }
}
