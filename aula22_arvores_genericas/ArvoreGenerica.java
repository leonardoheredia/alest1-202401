package aula22_arvores_genericas;

public class ArvoreGenerica {
    class Nodo {
        private static int CAPACIDADE = 5;
        private String valor;
        private Nodo[] filhos;
        private Nodo pai;
        private int numFilhos;
        public Nodo(String valor) {
            this.valor = valor;
            filhos = new Nodo[CAPACIDADE];
        }
        public void adicionarFilho(Nodo filho) {
            filhos[numFilhos] = filho;
            numFilhos++;
            filho.pai = this;
        }
    }
    private Nodo raiz;
    private int tamanho;
    public ArvoreGenerica(String raiz) {
        Nodo n = new Nodo(raiz);
        this.raiz = n;
        tamanho = 1;
    }
    public void adicionarFilho(String pai, String filho) {
        Nodo nodoFilho = new Nodo(filho);
        Nodo nodoPai = buscarNodo(pai);
        nodoPai.adicionarFilho(nodoFilho);
        tamanho++;
    }
    private Nodo buscarNodo(String chave) { //B
        return buscarNodoRecursivo(raiz, chave);
    }
    private Nodo buscarNodoRecursivo(Nodo n, String chave) {
        if(n.valor.equals(chave)) return n;
        else {
            for (int i = 0; i < n.numFilhos; i++) {
                Nodo encontrado = buscarNodoRecursivo(n.filhos[i], chave);
                if(encontrado!=null) return encontrado;
            }
        }
        return null;
    }
    public String getPai(String chave) {
        Nodo nodo = buscarNodo(chave);
        if(nodo!=null) return nodo.pai.valor;
        return "<NAO EXISTE>";
    }
    public int getTamanho() {
        return tamanho;
    }
    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append("graph G {\n");
        toDotRecursivo(raiz, sb);
        sb.append("}\n");
        return sb.toString();
    }
    private void toDotRecursivo(Nodo n, StringBuilder sb) {
        for (int i = 0; i < n.numFilhos; i++) {
            sb.append(n.valor).append(" -- ").append(n.filhos[i].valor).append(";\n");
            toDotRecursivo(n.filhos[i], sb);
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo n = raiz;
        toStringRecursivo(n, sb);
        return sb.toString();
    }
    private void toStringRecursivo(Nodo n, StringBuilder sb) {
        if(n==raiz) sb.append(" { ");
        sb.append(n.valor);
        for (int i = 0; i < n.numFilhos; i++) {
            sb.append(" { ");
            toStringRecursivo(n.filhos[i], sb);
            sb.append(" } ");
        }
        if(n==raiz) sb.append(" } ");
    }
}
