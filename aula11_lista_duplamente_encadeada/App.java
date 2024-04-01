package aula11_lista_duplamente_encadeada;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();
        ld.adicionar("leonardo");
        System.out.println(ld);
        ld.adicionar("tales");
        System.out.println(ld);
        ld.adicionar("alexandre");
        ld.adicionar("mariana");
        System.out.println(ld);
        ld.adicionar(1, "karina");
        System.out.println(ld);
    }
}
