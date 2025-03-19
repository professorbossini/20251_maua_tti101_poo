import javax.swing.JOptionPane;
public class SomaDoisNumerosGUI{
    static public void main(String args []){
        //declaração de variáveis
        //float, double
        double variavel1, variavel2, solucao;
        //entrada
        //float(input())
        //f(g(x))
        variavel1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite valor 1")
        );
        variavel2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor 2")
        );
        //processamento
        solucao = variavel1 + variavel2;
        /*saida*/
        JOptionPane.showMessageDialog(null, "Resultado: " + solucao);    
    }
}