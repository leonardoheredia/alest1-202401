package aula16_pilhas;

import java.util.Arrays;

public class PilhaEstatica {
    private final int CAPACIDADE_INCICIAL = 5;
    private int capacidade;
    private int tamanho;
    private String[] itens;
    private int topo;
    private int base;
    public PilhaEstatica() {
        capacidade = CAPACIDADE_INCICIAL;
        itens = new String[capacidade];
        tamanho = 0;
        base = 0;
        topo = -1;
    }
    private void duplicarCapacidade() {
        capacidade = capacidade * 2;
        String[] novoItens = new String[capacidade];
        //copia todos os valores do array itens para o novoItens
        for (int i = 0; i <itens.length ; i++) {
            novoItens[i] = itens[i];
        }
        itens = novoItens;
    }
    public void empilhar(String item) {
        if(tamanho==capacidade) {
            duplicarCapacidade();
        }
        topo++;
        itens[topo] = item;
        tamanho++;
    }
    public String desempilhar() {
        String valor = null;
        if(tamanho > 0) {
            valor = itens[topo];
            itens[topo] = null;
            topo--;
            tamanho--;
        }
        return valor;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        for (int i = topo; i >= base; i--) {
            sb.append(itens[i]).append(System.lineSeparator());
        }
        sb.append(System.lineSeparator());
        sb.append("Topo = ").append(itens[topo]);
        sb.append(System.lineSeparator());
        sb.append("Base = ").append(itens[base]);
        sb.append(System.lineSeparator());
        sb.append("Capacidade = ").append(capacidade);
        return sb.toString();
    }
}
