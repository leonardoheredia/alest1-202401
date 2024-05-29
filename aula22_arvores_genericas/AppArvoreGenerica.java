package aula22_arvores_genericas;

public class AppArvoreGenerica {
    public static void main(String[] args) {
        ArvoreGenerica arvore = new ArvoreGenerica("A");
        arvore.adicionarFilho("A", "B");
        arvore.adicionarFilho("A", "D");
        arvore.adicionarFilho("B", "E");
        arvore.adicionarFilho("B", "F");
        arvore.adicionarFilho("B", "G");
        arvore.adicionarFilho("D", "H");
        arvore.adicionarFilho("D", "I");
        System.out.println(arvore.toDot());

        System.out.println("Tamanho = " + arvore.getTamanho());
        arvore.getPai("OOO");
    }
}
