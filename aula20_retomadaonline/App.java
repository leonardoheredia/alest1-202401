package aula20_retomadaonline;

public class App {
    public static void main(String[] args) {
        ListaEncadeada listaCompras = new ListaEncadeada();
        listaCompras.adicionar("coca-cola");
        listaCompras.adicionar("leite");
        listaCompras.adicionar("agua mineral");
        listaCompras.adicionar("massa");
        listaCompras.adicionar("salgadinho");
        System.out.println(listaCompras);

        System.out.println("--------");
        System.out.println("Buscar");
        System.out.println(listaCompras.buscar(1));

    }
}
