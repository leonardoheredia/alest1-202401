package aula20_retomadaonline;

public class ListaEncadeada {
    class Nodo {
        String item;
        Nodo proximo;
        public Nodo(String item) {
            this.item = item;
            proximo = null;
        }
    }
    private Nodo inicio;
    private Nodo fim;
    private int tamanho;
    public ListaEncadeada() {
        tamanho = 0;
        inicio = null;
        fim = null;
    }
    public void adicionar(String item) {
        Nodo n = new Nodo(item);
        if(tamanho==0) {
            inicio = n;
            fim = n;
        }
        else {
            fim.proximo = n;
            fim = n;
        }
        tamanho++;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo aux = inicio;
        while(aux!=null) {
            sb.append(aux.item).append(System.lineSeparator());
            aux = aux.proximo;
        }
        return sb.toString();
    }
    public int getTamanho() {
        return tamanho;
    }
    public String buscar(int posicao) {
       Nodo aux = inicio;
       int p = 0;
       while (aux!=null) {
           if(p == posicao) return aux.item;
           aux = aux.proximo;
           p++;
       }
       return null;
        /*
        Nodo aux = inicio;
        for (int p = 0; p < tamanho; p++) {
            if(p == posicao) return aux.item;
            aux = aux.proximo;
        }
        return null;
        */
    }
}
