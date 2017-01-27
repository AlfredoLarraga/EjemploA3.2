/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sspalarrragas.a3.pkg2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SSPALarrragaSA32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ejercicio o ejemplo 2"); 
       //Declaración de Variables
       double c1, c2, h;//c1=cateto 1 c2 =cateto 2 h=hipotenusa
    
      //Objeto para recibir datos
      Scanner kb= new Scanner (System.in);
      
      //Asigno Valores
      System.out.print("Ingrese primer cateto");
      c1=kb.nextDouble();
      System.out.print("Ingrese el segundo cateto");
      c2=kb.nextDouble();
      
      //Operación
      
     h=Math.sqrt((c1*c1+c2*c2));
     
     //Resultado
     System.out.println("Tu hipotenusa es"+h);
              
      
      
      
      
    }
    
}
