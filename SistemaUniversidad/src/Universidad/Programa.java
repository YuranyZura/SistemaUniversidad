
package Universidad;


public class Programa {
    
    private String codigo;
    private String nombre;
    private int horas;
    private Profesor unProfesor;

    public Programa(String codigo, String nombre, int horas, Profesor unProfesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
        this.unProfesor = unProfesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Profesor getUnProfesor() {
        return unProfesor;
    }

    public void setUnProfesor(Profesor unProfesor) {
        this.unProfesor = unProfesor;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }   

}
