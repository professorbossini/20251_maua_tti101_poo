import javax.swing.JOptionPane;
public class SomaDoisNumerosGUI{
    public static void main(String [] args){
        //declaração de variáveis
        double primeiroOperando, segundoOperando, resultado;
        //entrada
        primeiroOperando = Double.parseDouble(
            JOptionPane.showInputDialog("Primeiro valor")
        );
        segundoOperando = Double.parseDouble(
            JOptionPane.showInputDialog("Segundo valor")
        );
        //processamento
        resultado = primeiroOperando + segundoOperando;
        //saida
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}