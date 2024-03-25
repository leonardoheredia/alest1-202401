package aula08_listas_lineares;


import java.util.Arrays;

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
        //implementar
    }
    public String pegarItem(int posicao) {
        //implementar
        return null;
    }
    public int pegarPosicao(String item) {
        //implementar
        return -1;
    }
    public void remover(int posicao) {
        //implementar
    }
    public void limpar() {
        //implementar
    }
    public boolean estaVazia() {
        //implementar
        return false;
    }
    public boolean contem(String item) {
        //implementar
        return false;
    }
    public int getTamanhoAtual() {
        return tamanhoAtual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista = { ");
        for (int i = 0; i < tamanhoAtual; i++) {
            sb.append(itens[i] + " ");
        }
        return sb.append(" }").toString();
    }
}
