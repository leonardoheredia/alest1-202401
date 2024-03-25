package aula08_listas_lineares;

public class App {
    public static void main(String[] args) {
        ListaLinearEstatica listinha = new ListaLinearEstatica();
        listinha.adicionar("tomate");
        listinha.adicionar("cebola");
        listinha.adicionar("alho");
        System.out.println(listinha);

        listinha.adicionar(0, "detergente"); //tem que adicionar detergente na posicao 0
        listinha.adicionar("sabao");
        System.out.println(listinha);

        listinha.adicionar("maca");
        System.out.println(listinha);
    }
}
