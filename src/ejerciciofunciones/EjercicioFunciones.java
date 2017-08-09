/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofunciones;
import java.util.*;
/**
 *
 * @author Fabian Giraldo
 * @version 1
 * @since 09/08/2017
 * Ejercicio especificacion de funciones en Java
 */
public class EjercicioFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner flujoEnt = new Scanner(System.in);
        //Declaracion de variables
        String nombre = null;
        int numHoras = 0;
        double valorHora = 0;
        double valorPagar = 0;
        
        //Lectura de Datos
        System.out.println("Nombre:");
        nombre = flujoEnt.next();

        System.out.println("Horas Trabajadas");
        numHoras = flujoEnt.nextInt();
        
        System.out.println("Valor Hora ");
        valorHora = flujoEnt.nextDouble();
        
        //Invocando la funcion
        valorPagar = calcularSalario(numHoras, numHoras);
        System.out.println("Nombre " + nombre + " pago " + valorPagar);
        
   
    }
    
    /**
     * Funcion que permite calcular el salario de un empleado
     * @param horas numero entero indica cantidad de horas
     * @param valor real  indica el valor a pagar por cada hora de trabajo
     * @return  numero flotante con el valor a pagar
     */
    public static double calcularSalario(int horas, int valor){
        double totalSalario = 0;
        
        
        return totalSalario;
    }
    
}
