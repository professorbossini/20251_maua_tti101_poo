import javax.swing.JOptionPane;
public class SomaDoisNumerosGUI{
    static public void main(String args []){
        //declaração de variáveis
        //float, double
        double n1, n2, resultadoDaSoma;
        //entrada
        //float(input())
        n1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite um valor")
        );
        n2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite outro valor")
        );
        //processamento
        resultadoDaSoma = n1 + n2; 
        /*saida*/
        JOptionPane.showMessageDialog(null, resultadoDaSoma);    
    }      
}