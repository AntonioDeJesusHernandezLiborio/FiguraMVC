package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.IFiguras;
import model.crearFiguras;
import view.frmFigure;

public class controllerFiguras implements ActionListener{
    private IFiguras figura;
    private crearFiguras modelFigure;
    private frmFigure  viewFigure;
    private Double datos[];
    
    
    public controllerFiguras(crearFiguras modelFigure, frmFigure  viewFigure){
        this.modelFigure = modelFigure;
        this.viewFigure = viewFigure;
        
        this.viewFigure.btnCalcular.addActionListener(this);
        this.viewFigure.cmbFigura.addActionListener(this);
        
    }
    
    public void iniciar(){
        viewFigure.setTitle("MVC + FACTORY");
        viewFigure.setLocationRelativeTo(null);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String opString = viewFigure.cmbFigura.getModel().getSelectedItem().toString();
        if (e.getSource() == viewFigure.cmbFigura) {
            switch(opString){
                case "cuadrado":
                    habilitarUno();
                    viewFigure.ladoA.setText("Lado");
                    break;
                case "rectangulo":
                    habilitarTodo();
                    viewFigure.ladoA.setText("Lado A");
                    viewFigure.ladoB.setText("Lado B");
                    break;
                case "triangulo":
                    habilitarTodo();
                    viewFigure.ladoA.setText("Altura");
                    viewFigure.ladoB.setText("Base");
                    break;
                case "circulo":
                    habilitarUno();
                    viewFigure.ladoA.setText("Radio");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }  
        }
        if(e.getSource() == viewFigure.btnCalcular){
            switch(opString){
                case "cuadrado":
                    crearYMandarParametrosCuadrado();
                    calcular();
                    break;
                case "rectangulo":
                    crearYMandarParametrosRectangulo();
                    calcular();
                    break;
                case "triangulo":
                    crearYMandarParametrosTriangulo();
                    calcular();
                    break;
                case "circulo":
                    crearYMandarParametrosCirculo();
                    calcular();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }
    
    
    private void crearYMandarParametrosCuadrado(){
        datos = new Double[1];
        datos[0]= Double.parseDouble(viewFigure.txtLadoA.getText());
        figura = modelFigure.crear("cuadrado");
    }
    private void crearYMandarParametrosRectangulo(){
        datos = new Double[2];
        datos[0]= Double.parseDouble(viewFigure.txtLadoA.getText());
        datos[1]= Double.parseDouble(viewFigure.txtLadoB.getText());
        figura = modelFigure.crear("rectangulo");
    }
    private void crearYMandarParametrosTriangulo(){
        datos = new Double[2];
        datos[0]= Double.parseDouble(viewFigure.txtLadoA.getText());
        datos[1]= Double.parseDouble(viewFigure.txtLadoB.getText());
        figura = modelFigure.crear("triangulo");
    }
    private void crearYMandarParametrosCirculo(){
        datos = new Double[1];
        datos[0]= Double.parseDouble(viewFigure.txtLadoA.getText());
        figura = modelFigure.crear("circulo");
        
    }
     
    
    private void habilitarTodo(){
        viewFigure.txtLadoA.setVisible(true);
        viewFigure.txtLadoB.setVisible(true);
        viewFigure.ladoA.setVisible(true);
        viewFigure.ladoB.setVisible(true);
    }
    private void habilitarUno(){
        viewFigure.txtLadoA.setVisible(true);
        viewFigure.txtLadoB.setVisible(false);
        viewFigure.ladoA.setVisible(true);
        viewFigure.ladoB.setVisible(false);
    }
    private void calcular(){
        figura.parametros(datos);
        viewFigure.areaTexto.setText(figura.descripcionString());
    }
}
