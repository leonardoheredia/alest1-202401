package aula07_pesquisa;

import utils.ArrayUtils;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        ArrayUtils.preencherArrayComValoresInteirosAleatorios(a,
                100,
                false);
        ArrayUtils.imprimir(a);
        if(pesquisaLinear(a, 44)) System.out.println("Oba!!! Achei!");
        else System.out.println("NAO ACHEI");
    }
    public static boolean pesquisaLinear(int[] a, int chave) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == chave) return true;
        }
        return false;
    }
}
