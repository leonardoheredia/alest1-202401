package aula07_pesquisa;

import utils.ArrayUtils;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] a = {15,20,23,26,28,32,37,40};
        boolean b = buscaBinaria(a, 27, 0, a.length-1);
        System.out.println(b);
        //if(pesquisaLinear(a, 44)) System.out.println("Oba!!! Achei!");
        //else System.out.println("NAO ACHEI");
    }
    public static boolean pesquisaLinear(int[] a, int chave) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == chave) return true;
        }
        return false;
    }
    public static boolean buscaBinaria(int[] a, int chave, int inicio, int fim) {
        if(inicio>fim) return false;
        int meio = (inicio + fim) / 2;
        if(a[meio]==chave) {
            return true;
        } else if(chave>a[meio]) {
            inicio = meio + 1;
            return buscaBinaria(a, chave, inicio, fim);
        } else {
            fim = meio - 1;
            return buscaBinaria(a, chave, inicio, fim);
        }
    }

    public static boolean fd(int[] a, int c, int i, int f) {
        if(i>f) return false;
        int m = (i + f) / 2;
        if(a[m]==c) return true;
        else if(c>a[m]) {
            i = m + 1;
            return fd(a, c, i, f);
        } else {
            f = m - 1;
            return fd(a, c, i, f);
        }
    }
}











