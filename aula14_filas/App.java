package aula14_filas;

public class App {
    public static void main(String[] args) {
        FilaEstatica f = new FilaEstatica();
        f.enfileirar("Matheus");
        System.out.println(f);
        f.enfileirar("Mayra");
        System.out.println(f);
        f.enfileirar("Cecilia");
        System.out.println(f);

        //Vamos desenfileirar
        String item = f.desenfileirar();
        System.out.println("tirei da fila o(a) " + item);
        System.out.println(f);

        //enfileiraar de novo
        f.enfileirar("Ana");
        System.out.println(f);

        f.enfileirar("Salete");
        System.out.println(f);

        f.enfileirar("Vitoria");
        System.out.println(f);
    }
}
