package aula11_lista_duplamente_encadeada;

import java.sql.ClientInfoStatus;

public class ListaDuplamenteEncadeada {
    private class Nodo {
        String item;
        Nodo proximo;
        Nodo anterior;
        public Nodo(String item) {
            this.item = item;
        }
    }
    Nodo inicio; //sentinela de inicio
    Nodo fim; //sentinela fim
    int tamanho;
    public ListaDuplamenteEncadeada() {
        inicio = new Nodo(null);
        fim = new Nodo(null);
        inicio.proximo = fim;
        fim.anterior = inicio;

    }
    public void adicionar(String item) {
       Nodo novo = new Nodo(item);
       novo.proximo = fim;
       novo.anterior = fim.anterior;
       fim.anterior.proximo = novo;
       fim.anterior = novo;
       tamanho++;
    }
    public boolean contem(String item) {
        return false;
    }
    public void adicionar(int posicao, String item) {

    }
    public void limpar() {

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista = { ");
        Nodo aux = inicio.proximo;
        while(aux!=fim) {
            sb.append(aux.item).append(" ");
            aux = aux.proximo;
        }
        sb.append("} tamanho = " + tamanho);
        return sb.toString();
    }
}
