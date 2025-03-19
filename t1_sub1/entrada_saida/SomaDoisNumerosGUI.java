import javax.swing.JOptionPane;
public class SomaDoisNumerosGUI{
    static public void main(String args []){
        //declaração de variáveis
        //float, double
        double a, b, resultado;
        //entrada
        //f(g(x))
        a = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor"));
        //processamento
        resultado = a + b; 
        //saida
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}