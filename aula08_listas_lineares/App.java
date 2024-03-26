package aula08_listas_lineares;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ListaLinearEstatica listinha = new ListaLinearEstatica();
        listinha.adicionar("tomate");
        listinha.adicionar("cebola");
        listinha.adicionar("alho");
        listinha.adicionar("batata");
        listinha.adicionar("alface");
        System.out.println(listinha);
        listinha.adicionar("brocolis");
        System.out.println(listinha);
        System.out.println(listinha.pegarItem(1));
        System.out.println(listinha.pegarPosicao("batata"));
        System.out.println(listinha.pegarPosicao("rucula"));
        listinha.adicionar(0, "detergente");
        System.out.println(listinha);
        //listinha.adicionar(0, "detergente"); //tem que adicionar detergente na posicao 0
        //listinha.adicionar("sabao");
        //System.out.println(listinha);

        //listinha.adicionar("maca");
        //System.out.println(listinha);
    }
}
