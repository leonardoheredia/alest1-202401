package aula18_exercicios.estruturas;

public class PilhaDinamica {
    class Nodo {
        String item;
        Nodo anterior;
        public Nodo(String item) {
            this.item = item;
            this.anterior = null;
        }
    }
    private Nodo base;
    private Nodo topo;
    private int tamanho;
    public PilhaDinamica() {
        tamanho = 0;
        base = null;
        topo = null;
    }
    public void empilhar(String item) {
        Nodo n = new Nodo(item);
        if(tamanho==0) {
            base = n;
            topo = n;
        }
        else {
            n.anterior = topo;
            topo = n;
        }
        tamanho++;
    }
    public String desempilhar() {
        if(tamanho==0) return null;

        String valor = topo.item;
        if(topo.anterior!=null) {
            topo = topo.anterior;
        }
        tamanho--;
        return valor;
    }
    public void limpar() {
        base = null;
        topo = null;
        tamanho = 0;
    };
    public void mergear(PilhaDinamica outraPilha) {
        PilhaDinamica pilhaAux = new PilhaDinamica();


    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        Nodo aux = topo;
        while(aux!=null) {
            sb.append(aux.item).append(System.lineSeparator());
            aux = aux.anterior;
        }
        sb.append("base = " + base.item + ", topo = " + topo.item);
        return sb.toString();
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho==0;
    }
}
