package aula11_lista_duplamente_encadeada;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        System.out.println(lista);
        lista.adicionar("cecilia");
        System.out.println(lista);
        lista.adicionar("vitor");
        System.out.println(lista);
        lista.adicionar("salete");
        System.out.println(lista);

        System.out.println(lista.contem("joao"));
        System.out.println(lista.contem("cecilia"));
        lista.adicionar(2, "joao");
        System.out.println(lista);
    }
}
