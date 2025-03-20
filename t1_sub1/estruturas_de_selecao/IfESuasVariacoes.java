package t1_sub1.estruturas_de_selecao;
import java.util.Scanner;
public class IfESuasVariacoes {
    public static void main(String[] args) {
        // operador de inferência de tipo
        //java 10+: var
        var leitor = new Scanner(System.in);
        System.out.println("Digite a nota");
        var nota = leitor.nextDouble();
        //if/else aninhado(nested (nest é ninho))
        if(nota >= 9){
            System.out.println("A");
        }
        else{
            if(nota >= 8){
                System.out.println("B");
            }
            else{
                if (nota >= 7) {
                    System.out.println("C");
                } 
                else{
                    System.out.println("Estudar mais um pouco");
                }
            }
        }
        
        System.out.println("Programa terminando...");
        leitor.close();
    }    
}
//if/else encadeado
// if(nota >= 9)
//     System.out.println("A");
// else if(nota >= 8)
//     System.out.println("B");
// else if(nota >= 7)
//     System.out.println("C");
// else
//     System.out.println("Estudar mais um pouco...");

// if(nota >= 6)
//     System.out.println("Aprovado");

// // System.out.println("Parabéns");

// //dangling else
// else{
//     System.out.println("Não aprovou ainda...");
//     System.out.println("Estudar um pouco mais");
// }