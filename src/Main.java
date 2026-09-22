import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        int num = 0;
        ArrayList<String> listaPendiente = new ArrayList<>();
        ArrayList<String> listaCompletada = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean inicio = true;
        do {
            System.out.println("MENU GESTOR TAREAS \n");
            System.out.println(" 1- Añadir Tarea \n");
            System.out.println(" 2- Ver Tareas Pendientes \n");
            System.out.println(" 3- Marcar una Tarea como completada \n");
            System.out.println(" 4- Eliminar una Tarea \n");
            System.out.println(" 5- salir");
            num = sc.nextInt();

            if (num == 1) {

                System.out.println("Escriba el nombre de la tarea");
                String nombre = sc.next();
                System.out.println("Esta tarea esta completada? s/n");
                String decision = sc.next();
                if (decision.equalsIgnoreCase("n")) {
                    listaPendiente.add(nombre);
                } else {
                    listaCompletada.add(nombre);

                }
            } else if (num == 2) {
                System.out.println("Tareas pendientes");
                System.out.println(listaPendiente);

            } else if (num == 3) {
                System.out.println(listaPendiente);
                System.out.println("Escribe el nombre de la tarea que quieras completar");
                String nombreTarea = sc.next();
                if (nombreTarea.equalsIgnoreCase(nombreTarea)) {
                    listaPendiente.remove(nombreTarea);
                    listaCompletada.add(nombreTarea);
                }
            } else if (num == 4) {
                System.out.println("Lista pendiente;");
                System.out.println(listaPendiente);
                System.out.println("Lista completada:");
                System.out.println(listaCompletada);
                System.out.println("Escribe el nombre de la tarea que quieras eliminar");
                String nombreTarea = sc.next();
                if (nombreTarea.equalsIgnoreCase(nombreTarea)) {
                    listaPendiente.remove(nombreTarea);
                    listaCompletada.remove(nombreTarea);
                }
            } else if (num == 5) {
                inicio = false;
            }
         }

        while (inicio);
    }
}
