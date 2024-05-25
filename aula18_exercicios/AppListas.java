package aula18_exercicios;

import aula18_exercicios.estruturas.FilaDinamica;
import aula18_exercicios.estruturas.ListaLinearEstatica;
import aula18_exercicios.estruturas.ListaSimplesmenteEncadeada;
import aula18_exercicios.estruturas.PilhaDinamica;

public class AppListas {
    public static void main(String[] args) {

        //roteiro de teste
        //criar uma lista
        //adicionar 2 produtos (mamao, melancia)
        //imprimir a lista
        //adicionar 'laranja' na posicao 1
        //imprimir a lista
        //imprimir o item na posicao 1 --> tem que retornar laranja
        //adicionar 2 produtos (abacaxi, kiwi)
        //imprimir a lista
        //remover o item na ultima posicao


        //exemploListaLinearEstatica(); //falta o remover
        //exemploListaSimplesmenteEncadeada();
        questaProva();
    }

    public static void questaProva() {
        FilaDinamica fd = new FilaDinamica();
        for (int i = 10; i <= 50; i+=10) {
            String item = Integer.toString(i);
            fd.enfileirar(item);
        }
        PilhaDinamica pd = new PilhaDinamica();
        while(!fd.estaVazia()) pd.empilhar(fd.desenfileirar());
        while(!pd.estaVazia()) {
            System.out.println(pd.desempilhar());
        }
    }

    public static void exemploListaSimplesmenteEncadeada() {
        ListaSimplesmenteEncadeada l = new ListaSimplesmenteEncadeada();
        l.adicionar("mamao");
        l.adicionar("melancia");
        System.out.println(l);
        l.adicionar(1, "laranja");
        System.out.println(l);

        System.out.println(l.buscar(1));

        l.adicionar("abacaxi");
        l.adicionar("kiwi");
        System.out.println(l);



    }
    public static void exemploListaLinearEstatica() {
        System.out.println("Exemplo de Lista Linear Estatica");
        ListaLinearEstatica l = new ListaLinearEstatica();
        l.adicionar("mamao");
        l.adicionar("melancia");
        System.out.println(l);

        l.adicionar(1, "laranja");
        System.out.println(l);

        System.out.println(l.buscar(1));

        l.adicionar("abacaxi");
        l.adicionar("kiwi");
        System.out.println(l);

        System.out.println("Removendo...");
        l.remover(l.getTamanhoAtual()-1);
        System.out.println(l);
    }

}
