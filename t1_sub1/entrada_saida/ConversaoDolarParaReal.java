import javax.swing.JOptionPane;
public class ConversaoDolarParaReal{
    static public void main(String... args){
        //declaração de variáveis
        double cotacaoDolar, quantidadeDolares;
        double valorEmReais;

        //entrada
        //classe wrapper ou empacotadora
        cotacaoDolar = Double.parseDouble(
            JOptionPane.showInputDialog("Digite cotação")
        );

        quantidadeDolares = Double.parseDouble(
            JOptionPane.showInputDialog("Digite qtde dólares")
        );

        //processamento
        valorEmReais = cotacaoDolar * quantidadeDolares;

        //saída
        JOptionPane.showMessageDialog(null, valorEmReais);


    }
}