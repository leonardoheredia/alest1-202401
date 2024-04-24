package aula03_exercicios_analise_algoritmos;

public class ExemploComplexidade {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Algoritmo O(1)
        algoritmoConstante(array);

        // Algoritmo O(n)
        algoritmoLinear(array);

        // Algoritmo O(n^2)
        algoritmoQuadratico(array);

        // Algoritmo O(n^4)
        algoritmoPolinomialQuartico(array);

        // Novo algoritmo O(log n)
        algoritmoLogaritmico(array, 6);
    }

    public static void algoritmoConstante(int[] array) {
        // Loop for que itera sobre os primeiros 3 elementos do array
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento encontrado: " + array[i]);
        }
    }

    public static void algoritmoLinear(int[] array) {
        // Loop for que itera sobre todos os elementos do array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento encontrado: " + array[i]);
        }
    }

    public static void algoritmoQuadratico(int[] array) {
        // Loop for aninhado que compara cada elemento com todos os outros elementos
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Elemento 1: " + array[i] + ", Elemento 2: " + array[j]);
            }
        }
    }

    public static void algoritmoPolinomialQuartico(int[] array) {
        // Loop for aninhado quádruplo
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        System.out.println("Elemento 1: " + array[i] + ", Elemento 2: " + array[j] +
                                ", Elemento 3: " + array[k] + ", Elemento 4: " + array[l]);
                    }
                }
            }
        }
    }

    public static void algoritmoLogaritmico(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == valor) {
                System.out.println("Elemento encontrado na posição " + meio);
                return;
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Elemento não encontrado");
    }
}
