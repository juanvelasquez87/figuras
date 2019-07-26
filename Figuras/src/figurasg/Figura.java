/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Usuario
 */
abstract public class Figura {
    private float base, altura;
    
     public Figura(){}
     
     public void setBase(float base){
         this.base=base;         
     }
     public void setAltura(float altura){
         this.altura=altura;
     }
     public float getBase(){
         return base;
     }
     public float getAltura(){
         return altura;
     }
     
     abstract float Area();
     abstract float Perimetro();
    
}
