//precisamos de uma classe para viabilizar a existência do método main
import javax.swing.JOptionPane;
public class DistanciaEntreDoisPontos{
    //esse é o método main
    static public void main(String... args){
        //declaração de variáveis
        //float(4 bytes), double(8 bytes)
        float x1, x2, y1, y2;
        float distanciaEntre2Pontos;
        //entrada de dados
        //Double.parseDouble
        x1 = Float.parseFloat(JOptionPane.showInputDialog("Digite x1"));
        x2 = Float.parseFloat(JOptionPane.showInputDialog("Digite x2"));
        y1 = Float.parseFloat(JOptionPane.showInputDialog("Digite y1"));
        y2 = Float.parseFloat(JOptionPane.showInputDialog("Digite y2"));
        //processamento
        //type casting
        distanciaEntre2Pontos = 
            (float)(Math.sqrt(Math.pow(x2 - x1, 2) + (y2 - y1) * (y2 - y1)));
        //saída
        JOptionPane.showMessageDialog(null, distanciaEntre2Pontos);    
    }
}