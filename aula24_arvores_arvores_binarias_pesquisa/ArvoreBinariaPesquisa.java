package aula24_arvores_arvores_binarias_pesquisa;

public class ArvoreBinariaPesquisa {
    class Nodo {
        int chave;
        Nodo esquerda;
        Nodo direita;
        Nodo pai;
        public Nodo(int chave) {
            this.chave = chave;
        }
    }
    private Nodo raiz;
    private int tamanho;
    private String caminhoPreOrdem;
    private String caminhoPosOrdem;
    private String caminhoCentral;
    public void adicionar(int chave) {
        Nodo n = new Nodo(chave);
        if(raiz==null) { //meu primeiro nodo, logo eh a raiz
            raiz = n;
        }
        else {
           Nodo aux = raiz;
           Nodo paiDoAux = null;
           while(aux!=null) {
               paiDoAux = aux;
               if(chave <= aux.chave) {
                   aux = aux.esquerda; //qdo nao tiver filhos a esquerda o aux sera null
                   if(aux==null) { //achei o local para inserir
                       paiDoAux.esquerda = n;
                   }
               }
               else {
                   aux = aux.direita;
                   if(aux==null) { //achei o local para inserir
                       paiDoAux.direita = n;
                   }
               }
           }
        }
        tamanho++;
    }
    public void adicionar2(int chave) { //usando recursividade
        Nodo n = new Nodo(chave);
        if(raiz==null) {
            raiz = n;
        }
        else {
            adicionarRecursivo(n, raiz);
        }
        tamanho++;
    }
    private void adicionarRecursivo(Nodo n, Nodo pai) {
       if(n.chave<=pai.chave) {
           if(pai.esquerda==null) {
               pai.esquerda = n;
               n.pai = pai;
           }
           else adicionarRecursivo(n, pai.esquerda);
       }
       else {
           if(pai.direita==null) {
               pai.direita = n;
               n.pai = pai;
           }
           else adicionarRecursivo(n, pai.direita);
       }

    }


    public int getTamanho() {
        return tamanho;
    }
    public void percorrerEmProfundidade() {
        caminhoPreOrdem = "";
        caminhoPosOrdem = "";
        caminhoCentral = "";
        percorrerEmProfundidade(raiz);
    }
    private void percorrerEmProfundidade(Nodo n) {
        caminhoPreOrdem = caminhoPreOrdem + " " + n.chave;
        if(n.esquerda!=null) {
            percorrerEmProfundidade(n.esquerda);
        }
        caminhoCentral = caminhoCentral + " " + n.chave;
        if(n.direita!=null) {
            percorrerEmProfundidade(n.direita);
        }
        caminhoPosOrdem = caminhoPosOrdem + " " + n.chave;
    }
    public String getCaminhoPreOrdem() {
        return caminhoPreOrdem;
    }
    public String getCaminhoPosOrdem() {
        return caminhoPosOrdem;
    }
    public String getCaminhoCentral() {
        return caminhoCentral;
    }

    public void imprimirArvore() {
        imprimirArvoreRecusivamente(this.raiz, 0);
    }
    private void imprimirArvoreRecusivamente(Nodo raiz, int nivel) {
        if (raiz == null) return;
        nivel += 5;
        imprimirArvoreRecusivamente(raiz.direita, nivel);
        System.out.print("\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        System.out.print(raiz.chave + "\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        imprimirArvoreRecusivamente(raiz.esquerda, nivel);
    }
}
