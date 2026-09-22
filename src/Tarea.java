public class Tarea {
    String nombre;
    String descripcion;
    boolean pendiente;
    String prioridad;

   Tarea(String nombre,String descripcion,boolean pendiente,String prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pendiente = pendiente;
        comprobarPrioridad(prioridad);
    };

   public void comprobarPrioridad(String prioridad) {}
}
