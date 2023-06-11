
package snake;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PFondo extends JPanel{
    
    Color colorFondo = Color.white;//color de los cuadros
    int tamMax, tam, cant, residuo;
    
    public PFondo(int tamMax, int cant){//constructor al que se le pasan como parámetros el tamaño del panel y la cantidad de cuadros en x y y
        this.tamMax = tamMax;
        this.cant = cant;
        this.tam = tamMax / cant;
        this.residuo = tamMax % cant;//ayuda a centrar todos los cuadros
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);//regráfica cada que avance la serpiente
        pintor.setColor(colorFondo);//borra el último cuadro pintandolo del color elegido
        for(int i = 0; i < cant; i++){ //x
            for(int j = 0; j < cant; j++){ //y
                pintor.fillRect(residuo/2+i*tam, residuo/2+j*tam, tam-1, tam-1); //rellena los cuadros del fondo
            }
        }
    }
    
}
