import javax.swing.JOptionPane;
public class DistanciaDoisPontos{
    static public void main(String args []){
        //declaração de variáveis
        //float(4 bytes) ou double(8 bytes)
        float x1, y1, x2, y2;
        float distanciaEntre2Pontos;
        //type casting
        float f = (float)3.14;
        //entrada
        x1 = 
            Float.parseFloat(JOptionPane.showInputDialog("Digite é x1"));
        x2 = 
            Float.parseFloat(JOptionPane.showInputDialog("Digite x2"));
        y1 = 
            Float.parseFloat(JOptionPane.showInputDialog("Digite y1"));
        y2 = 
            Float.parseFloat(JOptionPane.showInputDialog("Digite y2"));
        //processamento
        distanciaEntre2Pontos = 
            (float) (Math.sqrt(Math.pow(x2 - x1, 2) + (y2 - y1) * (y2 - y1)));
        //saída
        JOptionPane.showMessageDialog(null, distanciaEntre2Pontos); 
    }
}