
/**
 * Describe a un estudiante
 */
public class Estudiante
{
    private String nombre;
    private int nota;

    /**
     * Constructor  
     */
    public Estudiante(String queNombre, int queNota)   {
        nombre = queNombre;
        nota = queNota;
    }

    /**
     *  Accesor para el nombre
     */
    public String getNombre()    {
        return nombre;
    }

    /**
     *  Accesor para la nota
     *
     */
    public int getNota()   {
        return nota;
    }

    /**
     *  Devuelve true si ha aprobado, false en otro caso
     *
     */
    public boolean haAprobado()    {
        return nota >= 5;
    }

    /**
     *  Muestra en pantalla los datos del estudiante
     *
     */
    public void mostrarEstudiante()    {
        System.out.println("Nombre : " + nombre +
            "\nNota : " + nota +
            "\nHa aprobado? : " +  (nota >= 5));
    }

     


}
