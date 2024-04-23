package aula17_exercicios;


public class App {
    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        pilha.empilhar("Joao");
        pilha.empilhar("Maria");
        pilha.empilhar("Jose");
        System.out.println(pilha);
    }
}
