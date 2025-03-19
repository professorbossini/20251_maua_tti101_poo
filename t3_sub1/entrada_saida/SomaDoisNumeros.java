import java.util.Scanner; 
public class SomaDoisNumeros{
    public static void main(String [] args){
        //declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        int primeiroOperando, segundoOperando;
        int resultado;
        //entrada
        System.out.println("Digite o primeiro operando");
        primeiroOperando = leitor.nextInt();
        System.out.println("Digite o segundo operando");
        segundoOperando = leitor.nextInt();
        //processamento
        resultado = primeiroOperando + segundoOperando; 
        //saida
        //Resultado: 7
        System.out.println("Resultado: " + resultado);
    }
}