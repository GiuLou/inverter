import java.util.Stack;

public class Fila {
    private Elemento frente;
    private Elemento tras;

    public Fila() {
        frente = null;
        tras = null;
    }

    public void enfileirar(String valor) {
        Elemento novoElemento = new Elemento(valor);
        if (tras != null) {
            tras.setProximo(novoElemento);
        }
        tras = novoElemento;
        if (frente == null) {
            frente = novoElemento;
        }
    }

    public String desenfileirar() {
        if (frente == null) {
            return null;
        }
        String valor = frente.getValor();
        frente = frente.getProximo();
        if (frente == null) {
            tras = null; 
        }
        return valor;
    }

    public boolean vazia() {
        return frente == null;
    }

    public void inverter() {
        Stack<String> pilha = new Stack<>();
        
       
        while (!vazia()) {
            pilha.push(desenfileirar());
        }

        
        while (!pilha.isEmpty()) {
            enfileirar(pilha.pop());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Elemento atual = frente;
        while (atual != null) {
            sb.append(atual.getValor());
            if (atual.getProximo() != null) {
                sb.append(", ");
            }
            atual = atual.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }
}
