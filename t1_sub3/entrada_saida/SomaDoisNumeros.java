//indentação
import java.util.Scanner;
public class SomaDoisNumeros{
    public static void main(String [] args){
        //declaração de variáveis
        int primeiroOperando, segundoOperando;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        //entrada
        System.out.println("Digite o primeiro valor");
        primeiroOperando = leitor.nextInt();
        System.out.println("Digite o segundo valor");
        segundoOperando = leitor.nextInt();
        //input("Digite algo");
        //processamento
        resultado = primeiroOperando + segundoOperando;
        //saida
        //Resultado: 5
        System.out.println("Resultado: " + resultado);  
        //System.out.printf("Resultado: %d", resultado);
        
        
    }    
}

//Rodrigo Bossini
//RodrigoBossini