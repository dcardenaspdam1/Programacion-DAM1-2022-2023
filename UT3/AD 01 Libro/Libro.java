/**
 * Esta clase mantiene información sobre un libro.
 * Podría formar parte de una aplicación más grande
 * como un sistema que gestionase una librería, por ejemplo.
 *
 */
public class Libro  {
    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * constructor de objetos Libro
     */
    public Libro(String queAutor, String queTitulo, int quePaginas)     {
        autor = queAutor;
        titulo = queTitulo;
        numeroPaginas = quePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
    }

    /**
     * Accesor para el autor
     * @return   el autor del libro
     */
    public String getAutor()   {
        return autor;       
    }

    /**
     * Accesor para el título
     * @return   el título del libro
     */
    public String getTitulo()   {
        return titulo;        
    }

    /**
     * Accesor para el nº de páginas
     * @return   el nº de páginas
     */
    public int getPaginas()   {
        return numeroPaginas;        
    }

    /**
     * Accesor para el nº de referencia
     * @return   el nº de referencia
     */
    public String getReferencia()   {
        return numeroReferencia;        
    }

    /**
     * Accesor para el nº de veces que
     * se ha presatdo el libro
     * @return   el nº de veces prestado
     */
    public int getVecesPrestado()   {
        return vecesPrestado;        
    }

    /**
     * Mutador para el nº de referencia
     * @param  queReferencia   la nueva referencia del libro
     */
    public void setReferencia(String queReferencia)   {
        numeroReferencia = queReferencia;   
    }

    /**
     * Prestar el libro
     * Es un mutador, cambia el valor del
     * atributo vecesPrestado
     */
    public void prestar()    {
        vecesPrestado++;
    }

    /**
     * Muestra el autor en pantalla
     */
    public void printAutor()    {
        System.out.println("Autor " + autor);      
    }

    /**
     * Muestra el título en pantalla
     */
    public void printTitulo()    {
        System.out.println("Título " + titulo);      
    }

    /**
     * Mostrar la información del libro
     */
    public void printDetalles()    {
        System.out.println("Título: " + titulo +
            "\nAutor: " + autor +
            "\nNº de páginas: " + numeroPaginas + 
            "\nNº de referencia: " + numeroReferencia +
            "\nNº de veces prestado: " + vecesPrestado);  

    }

}
