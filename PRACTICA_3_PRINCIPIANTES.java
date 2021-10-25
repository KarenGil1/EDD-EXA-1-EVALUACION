//Practicas Gingerbread

package otra_prectica;

     import java.util.Arrays;
import java.util.Scanner;


public class PRACTICA_3_PRINCIPIANTES {


    public static void main(String[] args) {
        //2.- Capturar valores en arreglos y comparar
        Scanner input = new Scanner(System.in);
        int[] aiCaja1 = new int[10];
        int[] aiCaja2 = new int[10];
        int i, j;
        int iCont = 0;
        iCont++;
        for (i = 0; i < aiCaja1.length ; i++) {
            System.out.println("Ingresa el valor "+iCont+++" de tu primer arreglo: ");
            int valor1 = input.nextInt();
            aiCaja1[i]=valor1;
        }
        int contador = 0;
        contador++;
        for (j=0; j<aiCaja2.length; j++){
            System.out.println("Ingresa el valor "+contador+++" de tu segundo arreglo: ");
            int valor2 = input.nextInt();
            aiCaja2[j]=valor2;
        }
 
        System.out.println("Primer arreglo:");
        for (i = 0; i< aiCaja1.length; i++) {
            System.out.print("[" + aiCaja1[i] + "]");
        }
        System.out.println("");

        System.out.println("Segundo arreglo: ");
        for (j = 0; j<aiCaja2.length;j++){
            System.out.print("[" + aiCaja2[j] + "]");
        }

        System.out.println("");
        //Comparación
        if (Arrays.equals(aiCaja1,aiCaja2)){
            System.out.println("Los arreglos son idénticos");
        }else{
            System.out.println("No son iguales");
        }
    
    }
    
}


