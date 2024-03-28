package aula10_lista_encadeada;

public class App {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        lista.adicionar("joao");
        lista.adicionar("maria");
        lista.adicionar("jose");
        lista.adicionar("cecilia");

        System.out.println(lista);
        System.out.println(lista.getTamanho());
    }
}
