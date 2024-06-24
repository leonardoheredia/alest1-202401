package aula28_arvores_avl;

public class AppAVL {
    public static void main(String[] args) {
        //50, 30, 70, 10, 40, 35
        ArvoreAVL a = new ArvoreAVL();
        a.adicionar(50);
        a.adicionar(20);
        a.adicionar(80);
        a.adicionar(67);
        a.adicionar(91);
        a.adicionar(97);


        a.imprimirArvore();

        System.out.println();
        a.percorrerEmPreOrdem();
    }
}
