package aula05_recursao;

public class MaiorValorAula {
    public static void main(String[] args) {
        int[] a = {50, 32, 77, 13, 24};
        System.out.println(maiorValorNaoRecursivo(a));

        System.out.println(maiorValorRecursivo(a));
    }
    public static int maiorValorRecursivo(int a[]) {
        return maiorValorRecursivo(a, 0, Integer.MIN_VALUE);
    }
    private static int maiorValorRecursivo(int[] a, int i, int m) {
        int tam = a.length;
        if(i < tam) {
            if(a[i] > m) m = a[i];
            i++;
            return  maiorValorRecursivo(a, i, m);
        }
        return m;
    }
    public static int maiorValorNaoRecursivo(int[] a) {
        int m = Integer.MIN_VALUE;
        int tam = a.length;
        for (int i = 0; i < tam; i++) {
            if(a[i] > m) m = a[i];
        }
        return m;
    }




}
