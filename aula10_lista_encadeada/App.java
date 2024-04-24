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

        lista.adicionar(0, "tales");
        System.out.println(lista);
        lista.adicionar(1, "alexandre");
        System.out.println(lista);
        lista.adicionar(6, "joana");
        System.out.println(lista);
        lista.adicionar( "rafael");
        System.out.println(lista);
        lista.adicionar ("carla");
        System.out.println(lista);




    }
}
