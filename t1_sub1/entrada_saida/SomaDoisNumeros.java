//indentação
import java.util.Scanner;
public class SomaDoisNumeros{
    public static void main(String [] args){
        //declaração de variáveis
        // a = 1
        // a = "abc"
        //input("Digite o valor")
        int primeiroOperando, segundoOperando;
        int resultadoDaSoma;
        Scanner leitor = new Scanner(System.in);
        //entrada
        System.out.println("Digite o primeiro valor");
        primeiroOperando = leitor.nextInt();
        System.out.println("Digite o segundo valor");
        segundoOperando = leitor.nextInt();
        //processamento
        resultadoDaSoma = primeiroOperando + segundoOperando;
        //saida
        //Resultado: 5
        System.out.println("Resultado: " + resultadoDaSoma);
    }
}

//Rodrigo Bossini
//RodrigoBossini