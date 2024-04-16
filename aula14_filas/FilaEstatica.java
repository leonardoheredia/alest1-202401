package aula14_filas;

public class FilaEstatica {
    private final int CAPACIDADE_INICIAL = 5;
    private int capacidade;
    private String[] itens;
    private int tamanho;
    private int inicio;
    private int fim;
    public FilaEstatica() {
        inicializarFila();
    }
    public void enfileirar(String item) {
        if(fim+1==capacidade) { //vai estourar
            duplicarCapacidade();
        }
        itens[fim+1] = item;
        fim++;
        tamanho++;
    }
    private void duplicarCapacidade() {
        String[] arrayAnterior = new String[capacidade];
        for (int i = 0; i < itens.length; i++) {
            arrayAnterior[i] = itens[i];
        }
        int antigo_inicio = inicio;
        int antigo_fim = fim;

        capacidade = capacidade*2;
        fim = -1;
        inicio = 0;
        tamanho = 0;
        itens = new String[capacidade];

        //enfileirar todo mundo que tinha antes
        for (int i = antigo_inicio; i <=antigo_fim ; i++) {
            enfileirar(arrayAnterior[i]);
        }

    }
    public String desenfileirar() {
        String retorno = itens[inicio];
        itens[inicio] = null;
        inicio = inicio + 1;
        tamanho = tamanho - 1;
        return retorno;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FILA = { ");
        for (int i = inicio; i <= fim; i++) {
            sb.append(itens[i]).append(" ");
        }
        sb.append("}").append(" inicio=").append(itens[inicio]);
        sb.append(" fim=").append(itens[fim]);
        sb.append(" tam=").append(tamanho);
        return sb.toString();
    }
    public void limpar() {
        inicializarFila();
    }
    private void inicializarFila(){
        capacidade = CAPACIDADE_INICIAL;
        itens = new String[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }
    public void mergear(FilaEstatica outraFila) {
        //faz o merge da fila atual com a nova fila
        for (int i = 0; i < outraFila.tamanho; i++) {
            this.enfileirar(outraFila.itens[i]);
        }
    }

}
