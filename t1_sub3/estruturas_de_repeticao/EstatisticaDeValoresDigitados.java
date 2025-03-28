package t1_sub3.estruturas_de_repeticao;
import javax.swing.JOptionPane;
public class EstatisticaDeValoresDigitados {
    public static void main(String[] args) {
        int numero, soma = 0, maior = 0;
        do{
            // numero = java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite mais um numero"));
            numero = Integer.parseInt(
                JOptionPane.showInputDialog("Digite mais um numero")
            );
            if(numero > 0){
                // soma = soma + numero;
                soma += numero;
                if(numero > maior)
                    maior = numero;    
            }
        }while(numero > 0);
        System.out.printf("Soma: %d\n", soma);
        System.out.printf("Maior: %d\n", maior);
    }
}
