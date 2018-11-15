package Clases;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class panelImagen extends JPanel {
    private Image imagenes;
    
    //constructor para inicializar el objeto imagen a estado null
    public panelImagen(){
        imagenes=null;
    }
    
    public panelImagen(String nombreImagen){
        if(nombreImagen != null){
            imagenes=new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        }
    }
    
    // este metodo recibe la ruta enviada desde la clase internalFrameImagen para que se dibujada en el formulario
    public void setImagens(String nombreImagen){
        if(nombreImagen != null){
            imagenes = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        }else{
            imagenes = null;
        }
        repaint();
    }
    
    // este metodo abstracto dibuja la imagen con sus respectivas coordenadas
    @Override
    public void paint(Graphics g){
        if(imagenes != null){
            g.drawImage(imagenes, 0, 0, getWidth(), getHeight(), this);
            this.setOpaque(false);
        }else{
            this.setOpaque(true);
        }
        super.paint(g);
    }
    
}
