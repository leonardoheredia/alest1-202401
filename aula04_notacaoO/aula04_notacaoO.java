package aula04_notacaoO;

import utils.ArrayUtils;

public class aula04_notacaoO {

    public static void main(String[] args) {
        for (int n = 1000; n < 10_000; n++) {
            int[] array = new int[n];
            ArrayUtils.preencherArrayComValoresInteirosAleatorios(array, 100, true);
            System.out.println(n + ";" + encontrarMaiorValor(array) + ";" + encontrarNumero(array, 40));
        }
    }


    public static int encontrarNumero(int[] array, int numero) {
        int op = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==numero) {
                op++;
                return op;
            }
            op++;
        }
        return op;
    }
    public static int encontrarMaiorValor(int[] array) {
        int op = 0;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>maior) {
                maior = array[i];
                op++;
            }
            op++;
        }
        return op;
    }
}
