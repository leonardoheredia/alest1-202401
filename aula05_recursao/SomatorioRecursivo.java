package aula05_recursao;

public class SomatorioRecursivo {
    public static void main(String[] args) {
        System.out.println(somatorioNaoRecursivo(5));
        System.out.println(somatorio(5));
    }

    public static int somatorio(int n) {
        if( n == 1) return 1;
        else {
            return n + somatorio(n - 1);
        }
    }



    public static int somatorioNaoRecursivo(int n) {
        int soma = 0;
        for (int i = n; i >=0 ; i--) {
            soma = soma + i;
        }
        return soma;
    }

}
