/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nume = JOptionPane.showInputDialog("Digite el numero de personas");
        int num = Integer.parseInt(nume);

        double suma = 0;
       
                
        
        int i=0;
         while (i<num){
        
             String salario = JOptionPane.showInputDialog("Digite su salario");
             int sal = Integer.parseInt(salario);
             
            double cal = sal* 0.0925;
            double cal2 = sal*0.0508;
            double sum = cal+cal2; 
            suma = suma+sum;
             System.out.println("Mont de SEM: "+ cal);
             System.out.println("Monto de IVM"+ cal2);
             System.out.println("En consecuencia, la empresa debe pagar a la CCSS un total de: "+ sum);
             i++;
         }
         
         System.out.println("La empresa debe pagar a la CCSS el monto de: "+ suma +" por concepto de SEM Y IVM");
         
         
    }
    
}
