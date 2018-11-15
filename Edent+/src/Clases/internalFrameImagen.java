package Clases;

import Clases.panelImagen;
import javax.swing.JInternalFrame;

public class internalFrameImagen extends JInternalFrame {
    //objeto de tipo panelImage(clase panelImagen del proyecto) con el constructor q se declaro vacio dentro de la clase
    private panelImagen pi = new panelImagen();
    
    //constructor para el contenido del panel
    public internalFrameImagen(){
        setContentPane(pi);
    }
    
    // este metodo recive la ruta de la imagen que es enviada desde el formulario frmServiciosBasicos
    public void setImagenw( String nombreImagens){
        pi.setImagens(nombreImagens);
    }
}
