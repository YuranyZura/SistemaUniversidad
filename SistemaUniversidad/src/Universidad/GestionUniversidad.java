
package Universidad;

import java.util.ArrayList;

public class GestionUniversidad {
    
    public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    public static ArrayList<Profesor> listaProfesores = new ArrayList<>();
    public static ArrayList<Programa> listaProgramas = new ArrayList<>();
    public static ArrayList<Matricula> listaMatriculas = new ArrayList<>();
    
    /**
     * Agrega un alumno a la lista de Alumno
     * @param unAlumno 
     */
    
    public static void agregarAlumno(Alumno unAlumno){
        listaAlumnos.add(unAlumno);
    }
    
    /**
     * Agrega un profesor a la lista de profesores
     * @param unProfesor 
     */
    
    public static void agregarProfesor(Profesor unProfesor){
        listaProfesores.add(unProfesor);
    }
    
    public static void agregarPrograma(Programa unPrograma){
        listaProgramas.add(unPrograma);
    }
    
    public static void agregarMatricula(Matricula unaMatricula){
        listaMatriculas.add(unaMatricula);
    }
    
   /**
    * Método que verifica si existe un alumno dada la identificación
    * @param identificacion
    * @return true o false
    */
    
    public static boolean existeAlumno(String identificacion){
        boolean existe = false;
        int tamaLista = listaAlumnos.size();
        for(int i=0;i<tamaLista;i++){
            if(listaAlumnos.get(i).getIdentificacion().equals(identificacion)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
    /**
     * método que verifica si ya existe un profesor con dicha identificación
     * @param identificacion
     * @return  boolean true/false
     */
    
    public static boolean existeProfesor(String identificacion){
        boolean existe=false;
        for (int i=0;i<listaProfesores.size();i++){
            if (listaProfesores.get(i).getIdentificacion().equals(identificacion)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
    /**
     * Obtener alumno por Identificación
     * @param identificacion
     * @return Alumno un Alumno
     */
    
     public static Alumno obtenerAlumnoPorIdentificacion(String identificacion){
        Alumno unAlumno=null;
        for (int i=0;i<listaAlumnos.size();i++){
            if (listaAlumnos.get(i).getIdentificacion().equals(identificacion)){
               unAlumno=listaAlumnos.get(i);
               break;
            }
        }
        return unAlumno;
    }
     
     /**
      * Método que verifica si existe programa con determinado código
      * @param codigo
      * @return boolean, true o false
      */
     
     public static boolean existePrograma(String codigo){
         boolean existe=false;
         for(int i=0;i<listaProgramas.size();i++){
             if(listaProgramas.get(i).getCodigo().equals(codigo)){
                 existe=true;
                 break;
             }
         }
         return existe;
     }
     
     /**
      * Método que verifica si un alumno ya está matriculado
      * en determinado programa
      * @param unaMatricula
      * @return 
      */
     
     public static boolean estaMatriculado(Matricula unaMatricula){
         boolean existe = false;
         String identificacion = unaMatricula.getUnAlumno().getIdentificacion();
         String codigoPrograma = unaMatricula.getUnPrograma().getCodigo();
         for(int i=0;i<listaMatriculas.size();i++){
             if(listaMatriculas.get(i).getUnAlumno().getIdentificacion().equals(identificacion)
                     && listaMatriculas.get(i).getUnPrograma().getCodigo().equals(codigoPrograma)){
                 existe=true;
                 break;
             }
         }
         return existe;
     }
     
     /**
      * Actualiza un profesor en la lista
      * @param unProfesor profesor con los datos a actualizar
      */
     
     public static void actualizarProfesor(Profesor unProfesor){
         int posicion=0;
         String identificacion = unProfesor.getIdentificacion();
         for(int i=0;i<listaProfesores.size();i++){
             if(listaProfesores.get(i).getIdentificacion().equals(identificacion)){
                 posicion = i;
                 break;
             }
         }        
         listaProfesores.set(posicion, unProfesor);
     } 
}
