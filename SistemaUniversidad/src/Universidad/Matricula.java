
package Universidad;

import java.util.Date;

public class Matricula {
    
    private Programa unPrograma;
    private Alumno unAlumno;
    private Date fecha;

    public Matricula(Programa unPrograma, Alumno unAlumno, Date fecha) {
        this.unPrograma = unPrograma;
        this.unAlumno = unAlumno;
        this.fecha = fecha;
    }

    public Programa getUnPrograma() {
        return unPrograma;
    }

    public void setUnPrograma(Programa unPrograma) {
        this.unPrograma = unPrograma;
    }

    public Alumno getUnAlumno() {
        return unAlumno;
    }

    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Matricula { " + "unPrograma = " + unPrograma + ", unAlumno = " + unAlumno + ", fecha = " + fecha + '}';
    }
}
