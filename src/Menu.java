import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private PilaRutinas callStack = new PilaRutinas();

    public void desplegar() throws IOException {

        int opc = 0;

        while (opc != 5) {

            System.out.println("--- MENU ---");
            System.out.println("1. Llamar rutina");
            System.out.println("2. Finalizar rutina");
            System.out.println("3. Ver rutina actual");
            System.out.println("4. Mostrar call stack");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            opc = Integer.parseInt(reader.readLine());

            switch (opc) {

                case 1:
                    System.out.print("Nombre de la rutina: ");
                    String nombre = reader.readLine();

                    System.out.print("Tipo de retorno: ");
                    String tipo = reader.readLine();

                    callStack.push(new Rutina(nombre, tipo));
                    System.out.println("Rutina llamada correctamente \n");
                    break;

                case 2:
                    Rutina finalizada = callStack.pop();
                    if (finalizada == null) {
                        System.out.println("No hay rutinas activas\n");
                    } else {
                        System.out.println("Finalizando: " + finalizada + "\n");
                    }
                    break;

                case 3:
                    Rutina actual = callStack.peek();
                    if (actual == null) {
                        System.out.println("No hay rutina activa\n");
                    } else {
                        System.out.println("Rutina actual: " + actual + "\n");
                    }
                    break;

                case 4:
                    callStack.mostrarPila();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción invalida");
            }
        }
    }
}