package aula05_recursao;

import utils.ArrayUtils;

public class ExemplosRecursivos {
    public static void main(String[] args) {
        int numero = 4;
        System.out.println("Fatorial de : " + fatorial(numero));
        System.out.println("Somatorio: " + somatorio(numero));

        mensagem(numero);

        int[] array = {10, 20, 30, 40, 50};
        ArrayUtils.imprimir(array);
        inverterArrayNaoRec(array);
        ArrayUtils.imprimir(array);

        int[] array2 = {10, 20, 30, 40, 50};
        ArrayUtils.imprimir(array2);
        inverterArrayRec(array2, 0);
        ArrayUtils.imprimir(array2);

        System.out.println(maiorValorNaoRec(array2));
        System.out.println(maiorValorRec(array2, 0, Integer.MIN_VALUE));

    }
    public static int fatorial(int n) {
        if(n==0 || n==1) return 1;
        else {
            return n * fatorial(n-1);
        }
    }
    public static int somatorio(int n) {
        if(n==1) return 1;
        else return n + somatorio(n-1);
    }
    public static void mensagem(int n) {
        if(n>=1) {
            System.out.println(n + " oi");
            mensagem(n-1);
        }
    }
    public static void inverterArrayNaoRec(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
    }
    public static void inverterArrayRec(int[] a, int i) {
        int tamanho = a.length;
        if (i<tamanho/2) {
            int temp = a[i];
            a[i] = a[tamanho-i-1];
            a[tamanho-i-1] = temp;
            i++;
            inverterArrayRec(a, i);
        }
    }
    public static int maiorValorNaoRec(int[] a) {
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > maior) maior=a[i];
        }
        return maior;
    }

    public static int maiorValorRec(int[] a, int i, int maior) {
        if(i==a.length-1) {
            return maior;
        }
        if(a[i]>maior) maior=a[i];
        i++;
        return maiorValorRec(a, i, maior);
    }
}
