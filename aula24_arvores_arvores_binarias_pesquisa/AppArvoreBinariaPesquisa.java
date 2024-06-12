package aula24_arvores_arvores_binarias_pesquisa;

public class AppArvoreBinariaPesquisa {
    public static void main(String[] args) {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa();
        abp.adicionar(60);
        abp.adicionar(35);
        abp.adicionar(78);
        abp.adicionar(14);
        abp.adicionar(40);
        abp.imprimirArvore();

        System.out.println("");
        System.out.println("Tamanho = " + abp.getTamanho());

        System.out.println("");
        abp.percorrerEmProfundidade();

        System.out.println("Caminho pre-ordem: " + abp.getCaminhoPreOrdem());
        System.out.println("Caminho pos-ordem: " + abp.getCaminhoPosOrdem());
        System.out.println("Caminho central  : " + abp.getCaminhoCentral());

        //TESTAR
        //abp.adicionarRecursivo(100);
    }
}
