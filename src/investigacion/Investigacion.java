/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investigacion;

import java.util.Scanner;

/**
 *
 * @author consuelo
 */
public class Investigacion {
  
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int n =0;  
        //declaracion del switch case 
        System.out.println("Bienvenido a calculadora ingresa un valor ");
        System.out.println("0-suma");
        System.out.println("1-resta");
        System.out.println("2-multiplicacion");
        System.out.println("3-divicion");
        System.out.println("4-potencia");
        System.out.println("5-raiz");
        Scanner leer6 = new Scanner (System.in);
        
        n = leer6.nextInt();// parametro de lectura de datos por  teclado de tipo entero
        
        if (n <= 5 ){//condicional si n es menor que 5 se ejecuta el programa 
        System.out.println(" Al ataque! ");
        }
        else {//si no sale
        System.out.println("Ingresa un valor valido  ");
        }
      
        switch ( n){
        
        //declaracion de el arreglo para las operaciones ,suma ,resta ,divicion, multiplicacion, potencia y raiz de n
            case 0:
        Scanner leer = new Scanner (System.in);
        operacionesbasicas investigacion = new operacionesbasicas();//creacion del objeto operaciones basicas
        System.out.println("Ingresa un numero ");
        float n1 = leer.nextFloat();
         System.out.println("Ingresa otro numero ");
        float n2 = leer.nextFloat();
        
        float resultado = investigacion.suma(n1,n2);
        System.out.println("el resultado de la suma es : "+ resultado);
       break;
       
            
            case 1 :
        operacionesbasicas investigacion1 = new operacionesbasicas();
         Scanner leer0 = new Scanner (System.in);
       //datos de resta
       System.out.println("Bienvenido");
        System.out.println("Ingrese primer numero para sumar  ");
        n1 = leer0.nextFloat();
        
         System.out.println("Ingresa otro numero ");
        n2 = leer0.nextFloat();
        
         resultado = investigacion1.resta(n1,n2);
        System.out.println("el resultado de la resra1 es : "+ resultado);
        break;
            case 2:
       operacionesbasicas investigacion2 = new operacionesbasicas();
       Scanner leer1 = new Scanner (System.in);
        //datos de multiplicacion
        System.out.println("Bienvenido");
         System.out.println("Ingrese un numero ");
        n1 = leer1.nextFloat();
        
         System.out.println("Ingresa otro numero ");
        n2 = leer1.nextFloat();
        
        resultado = investigacion2.multiplicacion(n1,n2);
        System.out.println("el resultado de la multiplicacion es : "+ resultado);
        break;
            case 3:
        operacionesbasicas investigacion3 = new operacionesbasicas();
        Scanner leer2 = new Scanner (System.in);
        //datos de multiplicacion 
        System.out.println("Bienvenido");
          System.out.println("Ingrese un numero ");
        n1 = leer2.nextFloat();
        
         System.out.println("Ingresa otro numero ");
        n2 = leer2.nextFloat();
        
        resultado = investigacion3.divicion(n1,n2);
        System.out.println("el resultado de la divicion es : "+ resultado);
        break;
            case 4:
        operacionesbasicas investigacion4 = new operacionesbasicas();
        Scanner leer3 = new Scanner (System.in);
        //datos de potencia 
          System.out.println("Ingrese primer  numero para calcular la potencia ");
        n1 = leer3.nextFloat();
        
         System.out.println("Ingresa otro numero ");
        n2 = leer3.nextFloat();
        
        resultado = investigacion4.potencia(n1,n2);
        System.out.println("el resultado de la potencia es : "+ resultado);
        break;
            case 5:
        operacionesbasicas investigacion5 = new operacionesbasicas();
        Scanner leer4 = new Scanner (System.in);
        // datos de raiz 
        
         System.out.println("Ingrese un numero ");
        n1 = leer4.nextFloat();
        resultado = investigacion5.raiz(n1);
        System.out.println("el resultado de la raiz es : "+ resultado);
        break;
        
        
        
        }
    }
}

    
    

