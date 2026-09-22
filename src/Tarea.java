public class Tarea {
    String nombre;
    String descripcion;

    String prioridad;

   Tarea(String nombre,String descripcion,String prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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





    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
     comprobarPrioridad(prioridad);
    }
    @Override
    public String toString() {
       return getNombre() + " - " + getDescripcion() + " - " + getPrioridad();
    }
}
