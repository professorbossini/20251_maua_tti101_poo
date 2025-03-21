package t3_sub2.estruturas_de_selecao;
// import static javax.swing.JOptionPane.showInputDialog;
// import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;

public class OperadorTernario {
    public static void main(String[] args) {
        //wrapper (empacotadora)
        var idade = parseDouble(showInputDialog("Digite idade"));
        if(idade >= 18)
            System.out.println("Sim");
        else
            System.out.println("Não");
        var resposta = idade >= 18 ? "Sim" : "Não" ;
        System.out.println(resposta);
        System.out.println(idade >= 18 ? "Sim" : "Não");
        //pode dirigir
        //não pode dirigir
        showMessageDialog(
            null, 
            String.format(
                "%spode dirigir",
                idade >= 18 ? "" : "não "
            )
        );
        // showMessageDialog(
        //     null, 
        //     idade >= 18 ? "Sim" : "Não"
        // );

    }
}
