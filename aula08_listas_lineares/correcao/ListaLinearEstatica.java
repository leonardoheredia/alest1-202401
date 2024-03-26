package aula08_listas_lineares.correcao;


public class ListaLinearEstatica {
    private final int CAPACIDADE_INICIAL = 5;
    private int capacidade;
    private int tamanhoAtual;
    private String[] itens;
    public ListaLinearEstatica() {
        capacidade = CAPACIDADE_INICIAL;
        itens = new String[capacidade];
    }
    public void adicionar(String item) {
        if(tamanhoAtual>=capacidade) {
            System.out.println("nao tem mais espaco");
            return;
        }
        itens[tamanhoAtual] = item;
        tamanhoAtual++;
    }
    public void adicionar(int posicao, String item) {
        if(tamanhoAtual>=capacidade) {
            System.out.println("nao tem mais espaco");
            return;
        }
        // p   r   t   s   v
        // 0   1   2   3   4  5
        //
        for (int i = tamanhoAtual-1; i>=posicao ; i--) {
            itens[i+1] = itens[i];
        }
        itens[posicao] = item;
        tamanhoAtual++;
    }
    public String pegarItem(int posicao) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if(i==posicao) return itens[i];
        }
        return null;
    }
    public int pegarPosicao(String item) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if(item.equals(itens[i])) return i;
        }
        return -1;
    }
    public void remover(int posicao) {
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanhoAtual; i++) {
            sb.append(itens[i] + " ");
        }
        return sb.toString();
    }
}
