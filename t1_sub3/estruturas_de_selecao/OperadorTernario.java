package t1_sub3.estruturas_de_selecao;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
public class OperadorTernario {
    public static void main(String [] args) {
        //var: operador de inferência de tipo (Java 10+)
        //Integer (wrapper)
        // var idade = Integer.parseInt(showInputDialog("Digite a idade"));    
        var idade = parseInt(showInputDialog("Digite a idade"));    
        // if(idade >= 18)
        //     System.out.println("Sim");
        // else
        //     System.out.println("Não");
        // var resposta = idade >= 18 ? "Sim" : "Não";
        // System.out.println(resposta);
        // System.out.println(idade >= 18 ? "Sim" : "Não");
        showMessageDialog(null, idade < 18 ? "Não" : "Sim");
        //não faça isso
        // int a = 2, b = 3, c = 4;
        // var res = (a > b ? (b > c ?( c > 3 ? 5 : 4) : 2) : 1);

        //showMessageDialog
    }    
}
