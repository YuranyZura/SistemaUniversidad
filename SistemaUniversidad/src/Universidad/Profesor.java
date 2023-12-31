
package Universidad;

public class Profesor extends Persona{
    
    private String Profesion;
    
    public Profesor(String Profesion, String identificacion, String nombre, String correo) {
        super(identificacion, nombre, correo);
        this.Profesion = Profesion;
    }

    public String getProfesion() {
        return Profesion;
    }
    
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + " " + this.getProfesion();
    }  
}
