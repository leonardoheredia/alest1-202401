package aula18_exercicios.estruturas;

public class ListaSimplesmenteEncadeada {
    private class Nodo {
        String item;
        Nodo proximo;
        public Nodo(String item) {
            this.item = item;
        }
    }
    private Nodo inicio;
    private Nodo fim;
    private int tamanho;
    public ListaSimplesmenteEncadeada() {
        inicio = null;
        tamanho = 0;
    }
    public void adicionar(String item) {
        Nodo n = new Nodo(item);
        if(tamanho==0) { //se o inicio eh nulo entao a lista ta vazia
            inicio = n;
            fim = n;
        }
        else {
            fim.proximo = n;
            fim = n;
        }
        tamanho++;
    }
    public int getTamanho() {
        return tamanho;
    }
    public int buscar(String item){
        Nodo aux = inicio;
        int p = 0;
        while (aux!=null) {
            if(aux.item.equals(item)) return p;
            aux = aux.proximo;
        }
        return -1;
    }
    public String buscar(int posicao) {
        int p = 0;
        Nodo aux = inicio;
        while(aux!=null || p>posicao) {
            if(posicao==p) return aux.item;
            aux = aux.proximo;
            p++;
        }
        return null;
    }
    public void adicionar(int posicao, String item) {
        Nodo aux = inicio;
        Nodo anterior = null;
        for (int i = 0; i < posicao; i++) {
            anterior = aux;
            aux = aux.proximo;
        }
        Nodo n = new Nodo(item);
        if(anterior!=null) anterior.proximo = n;
        n.proximo = aux;
        if(posicao==0) inicio = n;
        if(posicao>tamanho-1) fim = n;
        tamanho++;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista = { ");
        Nodo aux = inicio;
        while(aux!=null) {
            sb.append(aux.item).append(" ");
            aux = aux.proximo;
        }
        sb.append(" }").append(tamanho);
        return sb.toString();
        //Joao Maria Jose
    }
}
