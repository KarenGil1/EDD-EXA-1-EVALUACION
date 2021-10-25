//Practicas Gingerbread

package practica_3_intermedio;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author vane_
 */
public class PRACTICA_4_PRINCIPIANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]numeros = new int [20];//arreglo 20
         for(int i = 0; i<20; i++){
            numeros[i] = (int)(Math.random()*20);//se usa Math.random para elegr numeros aleatorios del 0 al 20
        }
        //3. IMPRIMIR LOS VALORES
        for(int i=0; i<20; i++){
            System.out.print("["+numeros[i]+"]");//se imprimen los valores aleatorios del arreglo
        }
        HashMap<Integer, Integer> mapa = new HashMap<>();//HashMap simple de llave Interger y valor Interger
        for (int x = 0; x < numeros.length; x++) {
            int numero = numeros[x];//se crea una copia
            if (mapa.containsKey(numero)) {
                mapa.put(numero, mapa.get(numero) + 1);//con el metodo put se agrega un item al hashmap
            } else {
                mapa.put(numero, 1);
            }
        }
        int moda = 0, mayor = 0;// se genera la moda para saber cual es el numero que se repite 3 veces primero
        for (HashMap.Entry<Integer, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > mayor) {
                mayor = entry.getValue();
                moda = entry.getKey();
            }
        }

        System.out.println("\nEl numero que se repite 3 veces primero es: "+moda);//se mprime la frase con el valor
    }
}
