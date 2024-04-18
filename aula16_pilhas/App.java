package aula16_pilhas;

public class App {
    public static void main(String[] args) {
        PilhaEstatica pilha = new PilhaEstatica();
        pilha.empilhar("Maria");
        pilha.empilhar("Joao");
        pilha.empilhar("Ana");
        pilha.empilhar("Luana");
        pilha.empilhar("Carla");
        pilha.empilhar("Jose");
        System.out.println(pilha);
    }
}
