/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double valor1;
        double valor2;
        double[] resultado = new double[5];
        for(int i = 0; i < 5; i++){
            valor1 = bases[i];
            valor2 = potencias[i];
            resultado[i] = obtenerPotencia(valor1,valor2);
            System.out.println(resultado[i]);
        }
    }
    public static double obtenerPotencia(double a, double b){
        if (b == 1) {
            return a;
        } else{
            
            return a * obtenerPotencia(a, b - 1);
        }
    }
    }
    

    

