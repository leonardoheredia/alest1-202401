package aula05_recursao;

public class MaiorValorRecursivo {
    public static void main(String[] args) {
        int[] a = {12, 15, 55, 45, 16};
        int x = pegarMaiorValor(a, 0, Integer.MIN_VALUE);
        System.out.println(x);
    }
    public static int pegarMaiorValor(int[] a, int i, int m) {
        int tam = a.length;
        if(i<tam) {
            if(a[i] > m) m = a[i];
            return pegarMaiorValor(a, i+1, m);
        }
        return m;
    }
}
