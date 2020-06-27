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
public class rectangulo implements IFiguras{
    
    private double perimetro=0;
    private double area=0;
    private String nombre; 
    
    private double ladoA;
    private double ladoB;
    
    @Override
    public String descripcionString() {
        if(area == 0){
            calcularArea();
        }
        if(perimetro == 0){
            calcularPerimetro();
        }
        return "Esta figura es un Rectangulo el area es "
                + area + " y el perimetro es " + perimetro ;
    }

    @Override
    public void parametros(Double[] datos) {
        ladoA = datos[0];
        ladoB = datos[1];
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * (ladoA + ladoB);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = ladoA * ladoB;
        return area;
    }

    
    
}
