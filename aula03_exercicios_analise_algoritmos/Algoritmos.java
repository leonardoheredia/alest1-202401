package aula03_exercicios_analise_algoritmos;

public class Algoritmos {
    public static void main(String[] args) {

        System.out.println("n;operacoes");
        for (int n = 0; n < 1_000; n+=10) {
            System.out.println(n + ";" + alg_teste(n));
        }

    }
    public static int alg_01(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++) {
            operacoes++;
        }
        operacoes = 3 * operacoes + 3;
        return operacoes;
    }

    public static int alg_teste(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++) {
                    operacoes++;
                }
        }
        operacoes = 3 * operacoes + 3;
        return operacoes;
    }

}
