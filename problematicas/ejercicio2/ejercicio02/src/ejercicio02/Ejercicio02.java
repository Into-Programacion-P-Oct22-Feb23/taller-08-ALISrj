package ejercicio02;

/**
 *
 * @author Alexito
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int multiplicacion[] = {1, 2, 3, 4};
        int numero;
        int tabla1;
        int tabla2;
        int tabla3;
        int tabla4;
        
        System.out.println("N°\tx2\tx3\tx4");
        
        for (numero = 25; numero != 0; numero--) {

            tabla1 = numero * multiplicacion[0];
            tabla2 = numero * multiplicacion[1];
            tabla3 = numero * multiplicacion[2];
            tabla4 = numero * multiplicacion[3];
            System.out.printf("%d\t%d\t%d\t%d\n",
                     tabla1,
                     tabla2,
                     tabla3,
                     tabla4);

        }

    }

}
