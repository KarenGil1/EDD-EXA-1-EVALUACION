//Practicas Gingerbread

package principiante_1;

/**
 *
 * @author vane_
 */
public class PRACTICA_1_PRINCIPIANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aiBox = new int[15];
         for (int i = 0; i < aiBox.length; i++) {
              aiBox[i] = (int)(Math.random() * 50); 
             int m = aiBox[i]*2; 
              if( m%2 == 0) 
                 
               System.out.print("[" + m + "]");
        }
        
    }
    
}
