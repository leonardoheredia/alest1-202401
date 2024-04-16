package aula14_filas;

public class App {
    public static void main(String[] args) {
        FilaEstatica fila = new FilaEstatica();
        fila.enfileirar("Salete");
        fila.enfileirar("Eduarda");
        fila.enfileirar("Guilherme");
        System.out.println(fila);
        fila.desenfileirar();
        System.out.println(fila);
    }
}
