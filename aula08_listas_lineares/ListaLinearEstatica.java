package aula08_listas_lineares;

import java.util.Arrays;

public class ListaLinearEstatica {
    private final int CAPACIDADE_INICIAL = 5;
    private int capacidade;
    private int tamanhoAtual;
    private String[] itens;
    public void limpar() {
        itens = new String[capacidade];
        tamanhoAtual = 0;
    }
    public String pegarItem(int posicao) {
        if(posicao>=tamanhoAtual) return null;
        return itens[posicao];
    }
    public int pegarPosicao(String item) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if(itens[i].equals(item)) return i;
        }
        return -1;
    }
    public ListaLinearEstatica() {
        capacidade = CAPACIDADE_INICIAL;
        itens = new String[capacidade];
        tamanhoAtual = 0;
    }
    public void adicionar(int posicao, String item) {
        if(posicao>tamanhoAtual) {
            System.out.println("POSICAO INVALIDA");
            return;
        }
        if(tamanhoAtual==capacidade) aumentarCapacidade();

        for (int i = tamanhoAtual-1; i >=posicao ; i--) {
            itens[i+1] = itens[i];
        }
        itens[posicao] = item;
        tamanhoAtual++;

    }
    public void adicionar(String item) {
        if(tamanhoAtual==capacidade) {
            aumentarCapacidade();
        }
        itens[tamanhoAtual] = item;
        tamanhoAtual++;
    }
    private void aumentarCapacidade() {
        String[] itensAnterior = itens;
        capacidade = capacidade * 2;
        itens = new String[capacidade];
        for (int i = 0; i < tamanhoAtual; i++) {
            itens[i] = itensAnterior[i];
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista = { ");
        for (int i = 0; i < tamanhoAtual; i++) {
            sb.append(itens[i]).append(" ");
        }
        sb.append(" } capacidade = ").append(capacidade);
        return sb.toString();
    }
}






