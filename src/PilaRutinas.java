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
        for (int i = pila.size() - 1; i >= 0; i--) {
            System.out.println("| " + pila.get(i) + " |");

        }
        System.out.println("| Main() |");
        System.out.println("------------------\n");
    }
}