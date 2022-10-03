
/**
 *  Esta clase muestra algunos métodos con ejemplos de la sentencia condicional if y switch
 *  
 */
public class EjemplosCondicional
{
    // no incluimos atributos, es solo una clase de demostración

    /**
     * Constructor  
     */
    public EjemplosCondicional()    {

    }

    /**
     *  
     * if con else completo (if anidado)
     *  
     * 
     */
    public void printDescripcion(int edad, String nombre)    {

        if   (edad  <  13)  {
            System.out.println(nombre  +  " es un niño");   
        }
        else   {
            if  (edad  <  18)    {
                System.out.println(nombre  + " es un adolescente ");  
            }
            else 
            {
                System.out.println(nombre  +  "es un adulto");
            } 
        }

    }

    /**
     * if anidado, if ... else if
     */
    public void printDescripcionOtraVersion(int edad, String nombre)    {

        if   (edad  <  13)  {
            System.out.println(nombre  +  " es un niño");  
        }
        else  if  (edad  <  18)  {
            System.out.println(nombre  + " es un adolescente "); 
        }
        else  {
            System.out.println(nombre  +  " es un adulto");
        }
    }

    /**
     * 
     */
    public boolean  esPositivoPar(int numero)    {    
        if   ( (numero  > 0)  && (numero % 2 ==  0))    {            
            return true;
        }
        return false;   
    }

    /**
     * 
     */
    public boolean  metodoMisterioV1(int valor)    {        
        if   (valor  >= 0)    {
            return true;
        }
        return false;   
    }

    /**
     * Uso de una variable local para devolver el valor después con return
     */
    public boolean  metodoMisterioV2(int valor)    {
        boolean resul = false;
        if   (valor  >= 0)   {
            resul = true;
        }
        return resul;   
    }

    /**
     * El método anterior con expresión booleana
     */
    public boolean  metodoMisterioV3(int valor)    {

        return (valor >= 0);
    }

    /**
     * Demo de la sentencia switch
     */
    public  String demoSwitch(int dia)    {
        String nombreDia;
        switch    (dia)   {
            case 1:    nombreDia = "Lunes";
                break;
            case 2:    nombreDia = "Martes";
                break;
            case 3:    nombreDia = "Miércoles";
                break;
            case 4:    nombreDia = "Jueves";
                break;
            case 5:    nombreDia = "Viernes";
                break;
            case 6:    nombreDia = "Sábado";
                break;
            case 7:    nombreDia = "Domingo";
                break;
            default:  nombreDia = "Incorrecto";
                break;
        }
        return nombreDia;
    }

    /**
     *  Mostrar uno de estos tres mensajes:
     *  " xxxx personas sin caramelos"
     *  " cada persona con un caramelo"
     *  " xxxx personas con xx caramelos y sobran xx caramelos"
     */
    public void repartirCaramelos(int personas, int caramelos)    {
        if (personas > caramelos)  {
            System.out.println((personas - caramelos) + " personas sin caramelos");  
        }
        else if  (personas == caramelos)    {
            System.out.println("Una persona un caramelo");  
        }
        else    {
            System.out.println("Cada persona con " + (caramelos / personas) + " caramelos y sobran " +
                (caramelos % personas) + " caramelos");  
        }
    }

    /**
     *  Calcula y devuelve el valor absoluto de numero
     *
     */
    public int obtenerValorAbsoluto(int numero)    {
        if (numero < 0)    {
            numero = numero * -1;
        }
        return numero;
    }

    /**
     *  Muestra como letra el valor de numero
     * Para practicar if ... elseif ....
     * Asumimos numero >= 1 && numero <= 5
     */
    public void mostrarNumeroEnLetra(int numero)    {
        if (numero == 1)     {
            System.out.println("UNO");  
        }
        else if (numero == 2)     {
            System.out.println("DOS");  
        }
        else if (numero == 3)   {
            System.out.println("TRES");  
        }
        else if (numero == 4)   {
            System.out.println("CUATRO");  
        }
        else  {

            System.out.println("CINCO");  
        }

    }

    /**
     *  Devuelve true si la última cifra de numero es 7
     *
     */
    public boolean esSieteUltimaCifra(int numero)    {

        return numero % 10 == 7;

    }

    /**
     *  Escribir "El alumno hará la FCT" si es del curso segundo 'S' / 's' y ha 
     *  aprobado todo
     *  En cualquier caso mostrar el mensaje "Final de este método"
     */
    public void hacerFct(char curso, boolean haAprobado)    {
        if ((curso == 'S' || curso == 's')  && haAprobado)  {
            System.out.println("El alumno hará la FCT");   
        }
        // if (haAprobado && curso == 'S' || curso == 's') // así estaría mal 
        //{
        //        System.out.println("El alumno hará la FCT");  
        // }
        System.out.println("Final del método");   
    }

    /**
     *  Si numero es positivo se decrementa su valor, se multiplica por 2  y se escribe
     *  Si es negativo se incrementa, se divide entre 2 y se escribe también
     *
     */
    public void mostrarNumero(int numero)    {
        if (numero > 0)  {
            numero --;
            numero *= 2;            
        }
        else  {
            numero ++;
            numero /= 2;            
        }
        System.out.println("Número: " + numero);  
    }

    /**
     * Demo de la sentencia switch
     */
    public  void demoSwitch2(String dia)    {

        switch  (dia) {
            case "Lunes":     
            case "Martes":     
            case "Miércoles":    
            case "Jueves":     
            case "Viernes":   
                System.out.println("Laborable");
                break;

            default:  System.out.println("festivo");
                break;
        }

    }

    /**
     * Demo de la sentencia switch
     */
    public  boolean esVocalV1(char letra)    { 
        switch  (letra)  {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                return true;

            default:   
                return false;
        }

    }

    /**
     * Demo de la sentencia switch
     */
    public  boolean esVocalV2(char letra)    { 
        boolean resul;
        switch  (letra)        {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                resul = true;
                break;
            default:   
                resul = false;
                break;
        }
        return resul;

    }

    /**
     *  Calcula y devuelve los dis del mes indicado
     *  Para el mes febrero habrá que tener en cueta si año es o no bisiesto
     *  (múltiplo de 4)
     *  Si el mes es incorrecto devolver -1
     *
     */
    public int calcularDiasMesConSwitch(int mes, int año)    {
        int diasMes;
        if (mes < 1 || mes > 12)   {   // mes incorrecto
            diasMes = -1;
        }
        else    {
            switch  (mes)  {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:  diasMes = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:   diasMes = 30;
                    break;
                default:
                    if (año % 4 == 0)  {   // es bisiesto
                        diasMes = 29;
                    }
                    else  {
                        diasMes = 28;
                    }
                    break;

            }

        }
        return diasMes;

    }

    /**
     *  Calcula y devuelve los dis del mes indicado
     *  Para el mes febrero habrá que tener en cueta si año es o no bisiesto
     *  (múltiplo de 4)
     *  Si el mes es incorrecto devolver -1
     *
     */
    public int calcularDiasMesConSwitchV2(int mes, int año)    {
        int diasMes = 31;
        if (mes < 1 || mes > 12)   {   // mes incorrecto
            diasMes = -1;
        }
        else    {
            switch  (mes)  {
                case 4:
                case 6:
                case 9:
                case 11:   diasMes = 30;
                    break;
                case 2:
                    if (año % 4 == 0)  {   // es bisiesto
                        diasMes = 29;
                    }
                    else  {
                        diasMes = 28;
                    }
                    break;

            }

        }
        return diasMes;

    }

    /**
     *  Calcula y devuelve los días del mes indicado
     *  Para el mes febrero habrá que tener en cuenta si año es o no bisiesto
     *  (múltiplo de 4)
     *  Si el mes es incorrecto devolver -1
     *
     */
    public int calcularDiasMesConIf(int mes, int año)    {
        int diasMes;
        if (mes < 1 || mes > 12)  { // mes incorrecto
            diasMes = -1;
        }
        else  if  (mes == 1 | mes == 3 || mes == 5 || 
        mes == 7 || mes == 8 || mes == 10 || mes == 12)    {
            diasMes = 31;
        }
        else  if  (mes == 4 | mes == 6 || mes ==  9 || mes == 11)    {
            diasMes = 30;
        }    
        else   if (año % 4 == 0)  {  // mes febrero, ver si año es bisiesto
            diasMes = 29;
        }
        else  {
            diasMes = 28;
        }
        return diasMes;
    }

    /**
     *  Calcula y devuelve los días del mes indicado
     *  Para el mes febrero habrá que tener en cuenta si año es o no bisiesto
     *  (múltiplo de 4)
     *  Si el mes es incorrecto devolver -1
     *
     */
    public int calcularDiasMesConIfV2(int mes, int año)    {
        int diasMes = 31;
        if (mes < 1 || mes > 12)  { // mes incorrecto
            diasMes = -1;
        }
        else if  (mes == 4 | mes == 6 || mes ==  9 || mes == 11)    {
            diasMes = 30;
        }    
        else  if  (mes == 2) {
            if (año % 4 == 0)  {  // mes febrero, ver si año es bisiesto
                diasMes = 29;
            }
            else  {
                diasMes = 28;
            }

        }

        return diasMes;
    }

    /**
     *  si no es una letra mensaje error
     *  si letra vocal mayúscula escribir vocal mayúscula
     *  si letra vocal minúscula escribir minúscula
     *  escribir consonante en otro caso 
     *
     */
    public void detectarTipoLetra(char letra)    {
        if (letra < 'A' || letra > 'z' || (letra > 'Z' && letra < 'a'))   { 
            System.out.println("No es letra");
        }
        else if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')    {
            System.out.println("Vocal mayúscula");
        }
        else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')     {
            System.out.println("Vocal minúscula");
        }
        else   {
            System.out.println("Consonante");
        }

    }

    /**
     *  Generar un aleatorio  entre 1 y 10 y escribir si es par
     *
     */
    public void mostrarAleatorioPar()    {
        int aleatorio =   (int) (Math.random() * 10) + 1;
        if (aleatorio % 2 == 0)  {
            System.out.println(aleatorio + " es par");
        }

    }

    /**
     *  Generar un aleatorio  entre 50 y 100 y escribir si acaba en 3
     *
     */
    public void mostrarAleatorioAcaba3()    {
        int aleatorio =   (int) (Math.random() * 51) + 50;
        if (aleatorio % 10 == 3)  {
            System.out.println(aleatorio + " termina en 3");
        }
        else   {
            System.out.println(aleatorio + " no termina en 3");
        }

    }

    /**
     *  devuelve un String 
     *  1- NP / 2,3,4 – INS / 5 –
     *  SUF / 6 – B / 7,8 – NOT / 9,10 SB
     *  
     *  Asumimos nota correcta
     */
    public String notaToStringConIf(int nota)    {
        String strNota = "";
        if (nota == 1) {
            strNota = "NP";
        }
        else if (nota < 5) {
            strNota = "INS";
        }
        else if (nota == 5) {
            strNota = "SUF";
        }
        else if (nota == 6) {
            strNota = "B";
        }
        else if (nota <= 8) {
            strNota = "NOT";
        }
        else  {
            strNota = "SB";
        }
        return strNota;
    }

    /**
     *  devuelve un String 
     *  1- NP / 2,3,4 – INS / 5 –
     *  SUF / 6 – B / 7,8 – NOT / 9,10 SB
     *  
     *  Asumimos nota correcta
     */
    public String notaToStringConSwitch(int nota)    {
        String strNota;
        switch (nota) {
            case 1: strNota = "NP";            
                break;
            case 2:
            case 3:
            case 4: strNota = "INS";            
                break;
            case 5: strNota = "SUF";            
                break;
            case 6: strNota = "B";            
                break;
            case 7:
            case 8: strNota = "NOT";            
                break;
            default:  strNota = "SB";  
        }
        return strNota;
    }
    
   

 

}
