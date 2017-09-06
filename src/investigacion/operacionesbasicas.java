/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investigacion;

/**
 *
 * @author consuelo
 */
public class operacionesbasicas {
    
     int n = 0;
    
    
    //operacion de suma
    public float suma(float n1, float n2){
        
    
   float  resultado = n1 + n2;
 
    
    return resultado;
    
    
    
    };
    
    public float resta (float n1 , float n2 ){
         //operacion de resta
    float resultado = n1 - n2 ;
    
    return resultado ;
    
    };
   
     public float multiplicacion (float n1 , float n2 ){
          //operacion de multiplicacion
    float resultado = n1 * n2 ;
    
    return resultado ;
    
    };
     
     
     public float divicion (float n1 , float n2 ){
    float resultado = n1 / n2 ;
    
    return resultado ;
    
    }; 
     
      public float potencia (float n1 , float n2 ){
           //operacion de potencia 
    float resultado = (float) Math.pow(n1, n2);
    
    return resultado ;
    
    };
      
      
      public float raiz (float n1  ){
           //operacion de raiz
    float resultado = (float) Math.sqrt(n1);
    
    return resultado ;
    
    };
      
      
}

