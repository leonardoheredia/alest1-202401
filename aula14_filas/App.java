package aula14_filas;

public class App {
    public static void main(String[] args) {
        FilaEstatica filaA = new FilaEstatica();
        filaA.enfileirar("Joao");
        filaA.enfileirar("Maria");
        filaA.enfileirar("Jose");

        FilaEstatica filaB = new FilaEstatica();
        filaB.enfileirar("Carla");
        filaB.enfileirar("Joana");
        filaB.enfileirar("Ana");

        filaA.mergear(filaB);
        System.out.println(filaA);

    }
}
