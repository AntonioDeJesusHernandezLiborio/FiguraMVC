/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ANTONIO-LIBORIO
 */
public class cuadrado implements IFiguras{
    
    private double lado;
    private double perimetro=0;
    private double area=0;
    
    @Override
    public double calcularPerimetro() {
        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = lado * lado;
        return area;
    }

    @Override
    public String descripcionString() {
        if(area == 0){
            calcularArea();
        }
        if(perimetro == 0){
            calcularPerimetro();
        }
        
        return "Esta figura es un cuadrado el area es "
                + area + " y el perimetro es " + perimetro ;
    }

    @Override
    public void parametros(Double[] datos) {
        lado = datos[0];
    }

    

    
    
}
