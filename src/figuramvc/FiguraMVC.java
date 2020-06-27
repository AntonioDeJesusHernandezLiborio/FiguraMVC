package figuramvc;

import model.crearFiguras;
import view.frmFigure;
import controller.controllerFiguras;
/**
 * @author ANTONIO-LIBORIO
 */
public class FiguraMVC {

    public static void main(String[] args) {
        crearFiguras model = new crearFiguras();
        frmFigure view = new frmFigure();
        controllerFiguras controller = new controllerFiguras(model,view);
        controller.iniciar();
        view.setVisible(true);
        
    }
    
}
