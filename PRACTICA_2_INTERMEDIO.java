//Practicas Gingerbread

package practicaa;

import java.util.Scanner;

public class PRACTICA_2_INTERMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int arr[] = new int[15];
        int posicion;
        Scanner sc = new Scanner(System.in);
        //se leen por teclado los 15 numeros
        for (int i = 0; i < 15; i++) {
            System.out.println("Elemento (" + i + "):");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        //leemos la posición que nos interesa
        System.out.println("Posicion a eliminar: ");
        posicion = sc.nextInt();
        //desde el valor de posicion desplazamos hasta el final todos los elementos
        //con lo que el elemento que está en posicion, se pierde (se borra)
        for (int i = posicion; i < 14; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("queda : ");
        {
            for (int i = 0; i < 14; i++) {
                System.out.print("["+arr[i]+"]");
            }

        }
    }
}
