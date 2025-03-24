package t1_sub2.estruturas_de_selecao;
// import static javax.swing.JOptionPane.showInputDialog;
// import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class OperadorTernario {
    public static void main(String[] args) {
        var idade = parseInt(showInputDialog("Digite sua idade"));
        if(idade >= 18)
            System.out.println("Sim");
        else
            System.out.println("Não");
        var resposta = idade >= 18 ? "Sim" : "Não" ;

        showMessageDialog(null,resposta);
        System.out.println(resposta);

        System.out.println(idade >= 18 ? "Sim" : "Não");
        
        //não faça isso
        // int a = 2, b = 3, c = 4;
        // int res = a < b ? (b > c ? 2 : a > 5 ? 2 : 3) : 1; 
    }
}
