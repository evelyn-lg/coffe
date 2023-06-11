
package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class PSerpiente extends JPanel{
    
    Color colorSerpiente = Color.DARK_GRAY;//color de los cuadros
    Color colorFruta = Color.red;
    int tamMax, tam, cant, residuo;
    List<int[]> snake = new ArrayList<>();
    int[] fruta;
    String mov = "d";
    
    public PSerpiente(int tamC, int cant){//constructor al que se le pasan como parámetros el tamaño del panel y la cantidad de cuadros en x y y
        this.tamMax = tamC;//tamaño de toda la cuadricula
        this.cant = cant;
        this.tam = tamC / cant;//tamaño de cada cuadrito
        this.residuo = tamC % cant;//ayuda a centrar todos los cuadros
        int[] a = {cant/2-1, cant/2-1};//donde va aparecer la fruta al inicio
        int[] b = {cant/2, cant/2};//donde va aparecer la serpiente al inicio, a un lado de la fruta
        snake.add(a);
        snake.add(b);
    }
    
    @Override
    public void paint(Graphics pintar){
        super.paint(pintar);//regráfica cada que avance la serpiente
        pintar.setColor(colorSerpiente);//borra el último cuadro pintandolo del color elegido
        
        for(int i = 0; i < snake.size(); i++)
            pintar.fillRect((residuo/2)+snake.get(i)[0]*tam, (residuo/2)+snake.get(i)[1]*tam, tam-1, tam-1); //parametros: x, y, anacho y alto
            //residuo/2 es para que el nuevo cuadro pintado quede alineado con los otros
        
    }
        public void avanzar(){
            int[] ultimo = snake.get(snake.size()-1);
            int movX = 0;
            int movY = 0;
            switch(mov){
                case "r": //movimiento a la derecha
                    movX = 1;
                    break;
                case "l": //movimiento a la izquierda
                    movX = -1;
                    break;
                case "u": //movimiento hacia arriba
                    movY = 1;
                    break;
                case "d": //movimiento hacia abajo
                    movY = -1;
                    break;
            }//switch
            
            int[] direccion = {ultimo[0] + movX, ultimo[1] + movY};
            snake.add(direccion);
            snake.remove(0);
        }
    
}