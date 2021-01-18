/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import static ejercicios.Problema00.misterio;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        Suma(datos,0);
        System.out.printf("%d\n", Suma(datos, datos.length));
    }
        
    
    public static double Suma(double[][] datos, int i) {
        double suma = datos[i][0]+ datos[i][1]+datos[i][2];
        System.out.println(suma);
        i = i + 1;
        if (i < datos.length){
            Suma(datos,i);
        }
        return 0;
        
    }
}

    
    

