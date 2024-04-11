package aula14_filas;

public class FilaEstatica {
    private final int CAPACIDADE_INICIAL = 5;
    private int capacidade;
    private String[] itens;
    private int tamanho;
    private int inicio;
    private int fim;
    public FilaEstatica() {
        capacidade = CAPACIDADE_INICIAL;
        itens = new String[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }
    public void enfileirar(String item) {
        itens[fim+1] = item;
        fim++;
        tamanho++;
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
}
