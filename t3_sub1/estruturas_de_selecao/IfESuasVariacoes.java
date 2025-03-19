package t3_sub1.estruturas_de_selecao;
import java.util.Scanner;
public class IfESuasVariacoes {
    public static void main(String[] args) {
        //var: java 10+
        var leitor = new Scanner(System.in);
        double nota;
        
        System.out.println("Digite a nota");
        nota = leitor.nextDouble();
            
        //if/else encadeado
        if(nota >= 9){
            System.out.println("A");
            System.out.println("Parabéns");
        }
        else if(nota >= 8)
            System.out.println("B");
        else if (nota >= 7)
            System.out.println("C");
        else
            System.out.println("R");

        System.out.println("Programa acabando aqui...");
    }   
         
}
// if(nota >= 6){
//     System.out.println("Aprovado!");
//     System.out.println("Parabéns");
// }
// else{
//     System.out.println("Estudar mais");
// }
