package T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Pedido {
    int numero;
    int tempoPedido;
    int tempoPreparo;
    String status;
    public Pedido(int numero, int tempoPedido, int tempoPreparo) {
        this.numero = numero;
        this.tempoPedido = tempoPedido;
        this.tempoPreparo = tempoPreparo;
        this.status = "recebido";
    }
}
public class App {
    public static void main(String[] args) throws IOException {
        App app = new App();
        app.simular();
    }

    public void simular() throws IOException {
        Pedido p1 = new Pedido(100, 3, 4);
        Pedido p2 = new Pedido(101, 5, 2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tempo = 0;
        System.out.println("Pressione Enter para avançar o tempo ou 's' para sair...");

        while (true) {
            String input = reader.readLine();
            if (input. equalsIgnoreCase("s")) {
                System.out.println("Saindo do loop...");
                break;
            }
            if (input.isEmpty()) {
                tempo++;
                System.out.println("Tempo atual: " + tempo);
            }
        }
    }
}
