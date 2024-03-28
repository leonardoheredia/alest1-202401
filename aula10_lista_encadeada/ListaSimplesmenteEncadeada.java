package aula10_lista_encadeada;

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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista = { ");
        Nodo aux = inicio;
        while(aux!=null) {
            sb.append(aux.item).append(" ");
            aux = aux.proximo;
        }
        sb.append(" }");
        return sb.toString();
        //Joao Maria Jose
    }
}
