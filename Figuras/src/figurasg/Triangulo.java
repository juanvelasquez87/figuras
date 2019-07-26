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
public class Triangulo extends Figura {
    private float lado1,lado2;
    public Triangulo(){  
        super();
    }
    public void setLado1(float lado1){
        this.lado1=lado1;
    }
    public void setLado2(float lado2){
        this.lado2=lado2;
    }
    public float getLado1(){
        return lado1;
    }
    public float getLado2(){
        return lado2;
    }

    @Override
    float Area() {
     return (getBase()+getLado1())/2;
    }

    @Override
    float Perimetro() {
        return (getBase()+getLado1()+getLado2());
    }
    
}
