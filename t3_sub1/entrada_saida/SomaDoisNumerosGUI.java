import javax.swing.JOptionPane;
public class SomaDoisNumerosGUI{ //soma_dois_numeros_gui
    static public void main(String [] args){
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
        //saída
        JOptionPane.showMessageDialog(
            null, 
            "Resultado: " + resultado
        );
    }
}