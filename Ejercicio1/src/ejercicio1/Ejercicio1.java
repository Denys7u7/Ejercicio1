/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import static java.lang.Math.sqrt;

/**
 *
 * @author denny
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int i=0, j=0, div=0,raiz=0;
        for (i=1;i<20;i++) { 
            div=0; 
            raiz=(int)sqrt(i);
            for (j=1;j<=raiz;j++) {
                if (i%j==0)
                div++;
            }
            if (div<=1)
            System.out.println (" * "+i );
        }
    }
}
