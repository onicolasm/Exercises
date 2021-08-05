
import java.util.Arrays;

// LOOKUP FOR THE PEAK NUMBER SINGLE ARRAY USING LOOPS
// SAME ABOVE BUT OPTIMAL BINARY SEARCH
// SAME ABOVE BUT 2D ARRAY 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nicolas
 */
public class Main {

    public static void main(String[] args) {

        int[] test = {16, 0, 3, 8, 10, 5, 6, 9, 10, 11, 8, 12, 15};
        int aux = 0;

        if (test[test.length - 1] > aux) {
            aux = test[test.length - 1];
            for (int i = 1; i < test.length - 1; i++) {
                for (int j = i - 1; j < test.length; j++) {
                    for (int k = i + 1; k < test.length; k++) {
                        if (test[i] >= test[j] && test[i] >= test[k] && test[i] >= aux) {
                            aux = test[i];
                            if (test[test.length - 1] > aux) {
                                aux = test[test.length - 1];

                            }
                        }

                    }
                }
            }

        }

        if (test[0] > aux) {
            aux = test[0];
        }
        System.out.println(aux);

    }

}
