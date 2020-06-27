package model;

/**
 *
 * @author ANTONIO-LIBORIO
 */
public class triangulo implements IFiguras{
    private double area;
    private double perimetro;
    
    private double altura;
    private double base;
    

    @Override
    public void parametros(Double[] datos) {
        altura = datos[0];
        base = datos[1];
    }

    @Override
    public double calcularPerimetro() {
        int hipotenusa = (int) Math.sqrt((base*base)+(altura*altura));
        perimetro = base + altura + hipotenusa;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = (base * altura) / 2;
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
        return "Esta figura es un triangulo el area es "
                + area + " y el perimetro es " + perimetro ;
    }
    
}
