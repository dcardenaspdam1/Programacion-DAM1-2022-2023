import java.util.Arrays;

/**
 *  
 */
public class AppUT5UT5EjerArraysArrays
{

    /**
     *  
     *  
     */
    public static void main(String[] args)    {

        System.out.println("--------- escribirArray() -----------------");
        UT5EjerArrays.escribirArray();

        separador();

        System.out.println("\n--------- calcularMedia() -----------------");
        double[] valores = {2, 5, 6, 8, 9, 22, 13};        
        System.out.println("Valor inicial del array " + Arrays.toString(valores));
        System.out.println("La media es " + String.format("%10.2f", UT5EjerArrays.calcularMedia(valores)));

        separador();

        System.out.println("\n--------- calcularMaximo() -----------------");
        int[] numeros = {2, 5, 6, 8, 9, 22, 13};
        System.out.println("Valor inicial del array " + Arrays.toString(numeros));
        System.out.println("El máximo es es " + UT5EjerArrays.maximo(numeros));

        separador();

        System.out.println("\n--------- paresV1() -----------------");
        int[] resul = UT5EjerArrays.paresV1(numeros);
        System.out.println(Arrays.toString(resul));

        separador();

        System.out.println("\n---------  paresV2() -----------------");
        resul = UT5EjerArrays.paresV2(numeros);
        System.out.println(Arrays.toString(resul));

        separador();

        System.out.println("\n---------- rotarDerecha() ----------------");
        UT5EjerArrays.rotarDerecha(numeros);
        System.out.println(Arrays.toString(numeros));

        separador();

        System.out.println("\n-------- rotarDerechaV2() ------------------");
        resul =  UT5EjerArrays.rotarDerechaV2(numeros);
        System.out.println(Arrays.toString(resul));

        separador();

        System.out.println("\n---------- rotarDerechaV3() ----------------");
        UT5EjerArrays.rotarDerechaV3(numeros);
        System.out.println(Arrays.toString(numeros));

        separador();

        System.out.println("\n----------- expandir() ---------------");
        resul = UT5EjerArrays.expandir(numeros); 
        System.out.println(Arrays.toString(resul));

        separador();

        System.out.println("\n--------- calcularFrecuencias() -----------------");
        resul = UT5EjerArrays.calcularFrecuencias(); 
        System.out.println(Arrays.toString(resul));

        separador();

        System.out.println("\n----------- puente01() ---------------");
        numeros = new int[]{2034, 12, 223, 5432, 9999};
        System.out.println(Arrays.toString(numeros));
        UT5EjerArrays.puente01(numeros);

        separador();

        System.out.println("\n----------- puente02() ---------------");
        numeros = new int[]{2, 5, 7, 12, 9, 3};        
        UT5EjerArrays.puente02(numeros);

        separador();

        System.out.println("\n----------- puente03() ---------------");
        numeros = new int[]{2, 15, 7, 12, 9, 3};     
        System.out.println(Arrays.toString(numeros));
        int a = 1;
        int b = 4;
        System.out.println("Copia ordenada en el intervalo [" + a + ", " + b + "]\n" +
            Arrays.toString(UT5EjerArrays.puente03(numeros, a, b)));
        a = 4;
        b = 5;
        System.out.println("Copia ordenada en el intervalo [" + a + ", " + b + "]\n" +
            Arrays.toString(UT5EjerArrays.puente03(numeros, a, b)));
        a = 1;
        b = 14;
        System.out.println("Copia ordenada en el intervalo [" + a + ", " + b + "]\n" +
            Arrays.toString(UT5EjerArrays.puente03(numeros, a, b)));

    }
    public static void separador() {
        System.out.println("*************************************");

    }

}
