package aula22_arvores_genericas;

public class ArvoreGenerica {

    /*
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

     */
}
