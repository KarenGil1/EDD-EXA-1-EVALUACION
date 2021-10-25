//Practicas Gingerbread

package practica;

import java.util.*;

/**
 *
 * @author vane_
 */
public class PRACTICA_1_INTERMEDIO {

    public static void main(String[] args) {
        //Agregar valores a un arreglo, en el orden que les corresponde.
        int[] aiLinea = new int[15];
        int i;
        Scanner input = new Scanner(System.in);
        for (i = 0; i < aiLinea.length; i++) {
            System.out.println("Ingresa el valor: ");
            aiLinea[i] = input.nextInt();
            for (int j = aiLinea.length - 1; j >= 0; j--) {
                System.out.print(" [" + aiLinea[j] + "] ");
            }
        }
        System.out.println("");
    }
}
