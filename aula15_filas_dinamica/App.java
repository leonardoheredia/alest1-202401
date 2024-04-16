package aula15_filas_dinamica;

public class App {
    public static void main(String[] args) {
        FilaDinamica f = new FilaDinamica();
        f.enfileirar("Ana");
        f.enfileirar("Felipe");
        f.enfileirar("Guilherme");
        System.out.println(f);
        System.out.println("Tirar a --> " + f.desenfileirar());
        System.out.println(f);
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
        System.out.println(f.desenfileirar());
    }
}
