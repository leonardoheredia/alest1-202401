package aula08_listas_lineares;

import utils.ArrayUtils;

public class ListaLinearEstatica {
    private int CAPACIDADE;
    private int tamanho;
    private String[] itens;
    public ListaLinearEstatica() {
        tamanho = 0;
        CAPACIDADE = 5;
        itens = new String[CAPACIDADE];
    }
    public void adicionar(String item) {
        if(tamanho==CAPACIDADE) {
            System.out.println("JA ERA! NAO TEM MAIS ESPACO");
            return;
        }
        itens[tamanho] = item;
        tamanho++;
    }
    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(i + " - " + itens[i]);
        }
    }







}
