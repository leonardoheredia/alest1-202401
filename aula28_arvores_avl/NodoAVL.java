package aula28_arvores_avl;

public class NodoAVL {
    public int chave;
    public int altura;
    public NodoAVL esquerda;
    public NodoAVL direita;
    public NodoAVL pai;
    public NodoAVL(int chave) {
        this.chave = chave;
        altura = 0;
    }
}
