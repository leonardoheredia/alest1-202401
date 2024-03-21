package aula08_listas_lineares;

public class App {
    public static void main(String[] args) {
        ListaLinearEstatica listinha = new ListaLinearEstatica();
        listinha.adicionar("tomate");
        listinha.adicionar("cebola");
        listinha.adicionar("alho");
        listinha.adicionar("detergente");
        listinha.adicionar("shampoo");
        listinha.adicionar("condicionador");
        listinha.adicionar("refri");
        listinha.imprimir();
    }
}
