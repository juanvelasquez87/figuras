/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends Figura {
     public Cuadrado(){  
        super();
         float area,peri;
         
        
        
        
        
       
    }

    @Override
    float Area() {
     return getBase()*getAltura();
    }

    @Override
    float Perimetro() {
        return (getBase()+getAltura())*2;
    }
    
    
}
