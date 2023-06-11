
package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

public class PSerpiente extends JPanel{
    
    Color colorSerpiente = Color.white;//color de los cuadros
    Color colorComida = Color.red;
    int tamMax, tam, cant, residuo;
    List<int[]> snake;
    int[] fruta;
    
    public PSerpiente(int tamMax, int cant){//constructor al que se le pasan como parámetros el tamaño del panel y la cantidad de cuadros en x y y
        this.tamMax = tamMax;
        this.cant = cant;
        this.tam = tamMax / cant;
        this.residuo = tamMax % cant;//ayuda a centrar todos los cuadros
        int[] a = {cant/2-1, cant/2-1};//donde va aparecer la fruta al inicio
        int[] b = {cant/2, cant/2};//donde va aparecer la serpiente al inicio, a un lado de la fruta
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);//regráfica cada que avance la serpiente
        pintor.setColor(colorSerpiente);//borra el último cuadro pintandolo del color elegido
        
        
        //pintor.fillRect(residuo/2+i*tam, residuo/2+j*tam, tam-1, tam-1); //rellena los cuadros del fondo
    }
    
}