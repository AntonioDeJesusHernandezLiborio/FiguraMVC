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
public class crearFiguras {
    
    public IFiguras crear(String figura){
        switch(figura){
            case "cuadrado":
                return new cuadrado();
            case "rectangulo":
                return new rectangulo();
            case "triangulo":
                return new triangulo();
            case "circulo":
                return new circulo();
            default:
                return null;
        }
    }
}
