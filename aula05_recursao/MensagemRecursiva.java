package aula05_recursao;

public class MensagemRecursiva {
    public static void main(String[] args) {
        mensagem(3);
    }
    public static void mensagem(int n) {
        if(n>0) {
            System.out.println("oi");
            mensagem(n-1);
        }
    }

}
