
package snake;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PFondo extends JPanel{
    
    Color colorFondo = Color.white;//color de los cuadros
    int tamMax, tam, cant, residuo;
    
    public PFondo(int tamC, int cant){//constructor al que se le pasan como parámetros el tamaño del panel y la cantidad de cuadros en x y y
        this.tamMax = tamC;
        this.cant = cant;
        this.tam = tamC / cant;
        this.residuo = tamC % cant;//ayuda a centrar todos los cuadros
    }
    
    @Override
    public void paint(Graphics pintar){
        super.paint(pintar);//regráfica cada que avance la serpiente
        pintar.setColor(colorFondo);//borra el último cuadro pintandolo del color elegido
        for(int i = 0; i < cant; i++){ //x
            for(int j = 0; j < cant; j++){ //y
                pintar.fillRect(residuo/2+i*tam, residuo/2+j*tam, tam-1, tam-1); //rellena los cuadros del fondo
            }
        }
    }
    
}
