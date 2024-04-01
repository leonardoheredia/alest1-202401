package aula11_lista_duplamente_encadeada;

public class ListaDuplamenteEncadeada {
    class Nodo {
        String item;
        Nodo anterior;
        Nodo proximo;
        public Nodo(String item) {
            this.item = item;
        }
    }
    private Nodo inicio;
    private Nodo fim;
    private int tamanho;
    public ListaDuplamenteEncadeada() {
        inicio = new Nodo(null);
        fim = new Nodo(null);
        inicio.proximo = fim;
        fim.anterior = inicio;
        tamanho = 0;
    }
    public void adicionar(String item) {
        Nodo n = new Nodo(item);
        if(tamanho==0) {
            inicio.proximo = n;
            n.proximo = fim;
            n.anterior = inicio;
            fim.anterior = n;
        }
        else {
            n.proximo = fim;
            n.anterior = fim.anterior;
            fim.anterior.proximo = n;
            fim.anterior = n;
        }
        tamanho++;
    }
    public void adicionar(int posicao, String item) {
        Nodo aux = inicio.proximo;
        int p = 0;
        while(aux!=null) {
            if(posicao == p) {
                Nodo n = new Nodo(item);
                n.proximo = aux;
                n.anterior = aux.anterior;
                aux.anterior.proximo = n;
                aux.anterior = n;
                tamanho++;
                return;
            }
            aux = aux.proximo;
            p++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo aux = inicio.proximo;
        while (aux!=fim) {
            sb.append(aux.item).append(" ");
            aux = aux.proximo;
        }
        return sb.toString();
    }
}
