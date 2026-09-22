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

   public void comprobarPrioridad(String prioridad) {
       if (prioridad.equalsIgnoreCase("alta")) {
           this.prioridad = "alta";
       }
       else if (prioridad.equalsIgnoreCase("media")) {
           this.prioridad = "media";
       }
       else if (prioridad.equalsIgnoreCase("baja")) {
           this.prioridad = "baja";
       }
       else {
           this.prioridad = "ninguna";
       }

   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPendiente() {
        return pendiente;
    }

    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
     comprobarPrioridad(prioridad);
    }
}
