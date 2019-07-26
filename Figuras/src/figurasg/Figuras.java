/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner js=new Scanner(System.in);
        float base,altura;
        float op,opc;
        Figura fig[]= new Figura[3];
        Triangulo tri=new Triangulo();
        Cuadrado cu=new Cuadrado();
        
        op=JOptionPane.showOptionDialog(null,"ELIJE TU OPCIONá•¦(Ã²_Ã³Ë‡)á•¤" , "opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"cuadrado","triangulo"},"opcion");
        if (op==0) {
            opc=JOptionPane.showOptionDialog(null,"DESEAS AREA O PERIMETRO" , "opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"area","perimetro"},"opcion");
            
            
            if (opc==0) {
                float v1=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 1"));
                float v2=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 2"));
                cu.setBase(v1);
                cu.setAltura(2);
               
                JOptionPane.showMessageDialog(null,cu.Area(),"EL AREA DEL CUADRADO ES",JOptionPane.INFORMATION_MESSAGE);
            
            }else{
                float v1=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 1"));
                float v2=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 2"));
                cu.setBase(v1);
                cu.setAltura(v2);
               
                JOptionPane.showMessageDialog(null,cu.Perimetro(),"EL PERIMETRO DEL CUADRADO ES",JOptionPane.INFORMATION_MESSAGE);
            
            }
            
        }else{
            opc=JOptionPane.showOptionDialog(null,"DESEAS AREA O PERIMETRO" , "opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"area","perimetro"},"opcion");
            
            if (opc==0) {
                
                float v1=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 1"));
                float v2=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 2"));
                tri.setBase(v1);
                tri.setLado1(v2);
               
                JOptionPane.showMessageDialog(null,tri.Area(),"EL AREA DEL TRIANGULO ES",JOptionPane.INFORMATION_MESSAGE);
            
            }else{
                float v1=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 1"));
                float v2=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 2"));
                float v3=Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese valor 3"));
                tri.setBase(v1);
                tri.setLado1(v2);
                tri.setLado2(v3);
               
                JOptionPane.showMessageDialog(null,tri.Perimetro(),"EL PERIMETRO DEL TRIANGULO ES",JOptionPane.INFORMATION_MESSAGE);
            
            
        }
    }
 }
