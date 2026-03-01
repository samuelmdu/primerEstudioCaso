import java.util.ArrayList;

public class PilaRutinas {

    private ArrayList<Rutina> pila;

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public PilaRutinas() {
        pila = new ArrayList<>();
    }

    public void push(Rutina rutina) {
        pila.add(rutina);
    }

    public Rutina pop() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.removeLast();
    }

    public Rutina peek() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.getLast();
    }

    public void mostrarPila() {
        System.out.println("\n--- CALL STACK ---");
        if (isEmpty() == false){
            System.out.println("| " + peek() + " |");
        }
        System.out.println("| Main() |");
        System.out.println("------------------\n");
    }
}