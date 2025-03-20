package t1_sub1.estruturas_de_selecao;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;
public class SwitchCase {
    public static void main(String[] args) {
        var nota = parseInt(showInputDialog("Digite nota"));

        // ordem de inspeção ou avaliação
        //fall-through
        if(nota >= 0 && nota <= 10)
            switch(nota){
                case 10:
                    showMessageDialog(null, "Parabéns");
                case 9:
                    showMessageDialog(null, "A");
                    break;
                case 8:
                    showMessageDialog(null, "B");
                    break;
                case 7:
                    showMessageDialog(null, "C");
                default:
                    showMessageDialog(null, "Estudar um pouco mais");
            }
        else
            System.out.println("Nota inválida");
        
    }    
}
