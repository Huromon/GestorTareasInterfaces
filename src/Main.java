import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        ArrayList<Tarea> listaPendiente = new ArrayList<>();
        ArrayList<Tarea> listaCompletada = new ArrayList<>();
        Scanner sc = new Scanner(System.in);



        boolean inicio = true;
        do {
            System.out.println("MENU GESTOR TAREAS \n");
            System.out.println(" 1- Añadir Tarea \n");
            System.out.println(" 2- Ver Tareas Pendientes \n");
            System.out.println(" 3- Marcar una Tarea como completada \n");
            System.out.println(" 4- Eliminar una Tarea \n");
            System.out.println(" 5- Filtrar por Prioridad \n");
            System.out.println(" 6- Guardar lista\n");
            System.out.println(" 7- salir\n");
            num = sc.nextInt();

            if (num == 1) {

                System.out.println("Escriba el nombre de la tarea");
                String nombre = sc.next();
                System.out.println("Escriba el la descripcion de la tarea");
                String descripcion = sc.next();
                System.out.println("Escriba la prioridad de la tarea (alta/media/baja/ninguna)");
                String prioridad = sc.next();
                Tarea nueva = new Tarea(nombre,descripcion,prioridad);
                System.out.println("Esta tarea esta completada? s/n");
                String decision = sc.next();
                if (decision.equalsIgnoreCase("n")) {

                    listaPendiente.add(nueva);
                } else {
                    listaCompletada.add(nueva);

                }
            } else if (num == 2) {
                System.out.println("Tareas pendientes");
                for (int i = 0; i < listaPendiente.size(); i++) {
                    Tarea tarea = listaPendiente.get(i);
                    System.out.println(tarea.toString());
                }

            } else if (num == 3) {
                boolean encontrado = false;
                System.out.println(listaPendiente);
                System.out.println("Escribe el nombre de la tarea que quieras completar");
                String nombreTarea = sc.next();
                for (int i = 0; i < listaPendiente.size(); i++) {
                    Tarea tarea = listaPendiente.get(i);
                    if (tarea.getNombre().equalsIgnoreCase(nombreTarea)) {
                        listaPendiente.remove(tarea);
                        listaCompletada.add(tarea);
                        encontrado = true;
                    }
                }
                if (encontrado == false ) {
                    System.out.println("El nombre de la tarea no existe en pendientes");
                }


            } else if (num == 4) {
                boolean encontrado = false;
                System.out.println("Lista pendiente;");
                System.out.println(listaPendiente);
                System.out.println("Lista completada:");
                System.out.println(listaCompletada);
                System.out.println("Escribe el nombre de la tarea que quieras eliminar");
                String nombreTarea = sc.next();
                for (int i = 0; i < listaPendiente.size(); i++) {
                    Tarea tarea = listaPendiente.get(i);
                    if (tarea.getNombre().equalsIgnoreCase(nombreTarea)) {
                        listaPendiente.remove(tarea);
                        encontrado = true;
                    }
                }
                for (int i = 0; i < listaCompletada.size(); i++) {
                    Tarea tarea = listaCompletada.get(i);
                    if (tarea.getNombre().equalsIgnoreCase(nombreTarea)) {
                        listaCompletada.remove(tarea);
                        encontrado = true;
                    }
                }
                if (encontrado == false) {
                    System.out.println("no se ha encontrado ninguna tarea que quieras eliminar");
                }

            }else if (num == 5) {
                System.out.println("¿Por que prioridad desea filtrar?(alta/medio/baja/ninguna)");
                String prioridad = sc.next().toLowerCase();
                for (int i = 0; i < listaPendiente.size(); i++) {
                    Tarea tarea = listaPendiente.get(i);
                    if (tarea.getPrioridad().equalsIgnoreCase(prioridad)) {
                        System.out.println(tarea.toString());
                    }
                }
                for (int i = 0; i < listaCompletada.size(); i++) {
                    Tarea tarea = listaCompletada.get(i);
                    if (tarea.getPrioridad().equalsIgnoreCase(prioridad)) {
                        System.out.println(tarea.toString());
                    }
                }

            }else if (num == 6){
                try {

                    File archivo = new File("Lista_de_tareas.txt");
                    if (archivo.exists()) {
                        archivo.delete();
                        archivo.createNewFile();
                    }
                    FileWriter fw = new FileWriter(archivo,true);
                    fw.write("Lista de tareas\n");
                    fw.write("tareas pendientes:\n");
                    for (int i = 0; i < listaPendiente.size(); i++) {
                    fw.write(listaPendiente.get(i).toString());
                    }
                    fw.write("\n");
                    fw.write("tareas completas:\n");
                    for (int i = 0; i < listaCompletada.size(); i++) {
                        fw.write(listaCompletada.get(i).toString());
                    }
                    fw.close();

                }catch (IOException e){

                }


            } else if (num == 7) {
                inicio = false;
            }
         }

        while (inicio);
    }
}
