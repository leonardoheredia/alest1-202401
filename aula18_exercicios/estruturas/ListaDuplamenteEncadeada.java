package aula18_exercicios.estruturas;

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
    public void adicionar(String item) {  //O(1)
       Nodo novo = new Nodo(item);
       novo.proximo = fim;
       novo.anterior = fim.anterior;
       fim.anterior.proximo = novo;
       fim.anterior = novo;
       tamanho++;
    }
    public boolean contem(String item) { //O(n)
        Nodo aux = inicio.proximo;
        while(aux!=fim) {
            if(aux.item.equals(item)) return true;
            aux = aux.proximo;
        }
        return false;
    }
    public void adicionar(int posicao, String item) { //O(n)
        int p = 0;
        Nodo aux = inicio.proximo;
        while (aux!=fim) {
            if(posicao == p) {
                Nodo novo = new Nodo(item);
                novo.proximo = aux;
                novo.anterior = aux.anterior;
                aux.anterior.proximo = novo;
                aux.anterior = novo;
                tamanho++;
                return;
            }
            p++;
            aux = aux.proximo;
        }
    }
    public void limpar() {
        tamanho = 0;
        inicio.proximo = fim;
        fim.anterior = inicio;
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
