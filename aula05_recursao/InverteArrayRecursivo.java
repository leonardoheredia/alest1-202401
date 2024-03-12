package aula05_recursao;

import utils.ArrayUtils;

public class InverteArrayRecursivo {
    public static void main(String[] args) {
        int[] a = {53, 18, 27, 12, 95, 10};
        ArrayUtils.imprimir(a);
        inverterArrayNaoRecursivo(a);
        ArrayUtils.imprimir(a);

    }
    public static void inverterArrayNaoRecursivo(int[] a) {
        int tam = a.length;
        for (int i = 0; i < tam / 2; i++) {
            int temp = a[i];
            a[i] = a[tam -1 - i];
            a[tam-1-i] = temp;
        }
    }
}
