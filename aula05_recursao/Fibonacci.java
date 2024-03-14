package aula05_recursao;
public class Fibonacci {
    private static int operacoes;
    public static void main(String[] args) {
        System.out.println(fibo(0));
        System.out.println(fibo(1));
        System.out.println(fibo(2));
        System.out.println(fibo(3));
        System.out.println(fibo(4));
        System.out.println(fibo(5));
        System.out.println(fibo(6));
        System.out.println("-----");
        obterComplexidade();
    }
    public static int fibo(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibo(n-1) + fibo(n -2);
    }

    public static void obterComplexidade() {
        int N = 25;
        operacoes = 0;
        for (int i = 0; i < N; i++) {
            fibo2(i);
            System.out.println(operacoes);
        }
    }

    public static int fibo2(int n) {
        operacoes++;
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibo2(n-1) + fibo2(n -2);
    }
}
