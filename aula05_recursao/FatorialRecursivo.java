package aula05_recursao;

public class FatorialRecursivo {
    public static int fatorial(int n) {
        if(n==0 || n==1) return 1;
        else return n * fatorial(n-1);
    }
    public static int fatorialNaoRecursivo(int n) {
       //n! = n * (n - 1)
        int resultado = n;
        for (int i = n-1; i > 0 ; i--) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(fatorialNaoRecursivo(5));
        System.out.println(fatorial(5));
    }
}
