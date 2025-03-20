package t1_sub2.estruturas_de_selecao;
import java.util.Scanner;
public class IfESuasVariacoes {
    public static void main(String[] args) {
        //java 10+
        //operador de inferência de tipo: var
        var leitor = new Scanner(System.in);
        System.out.println("Digite a nota");
        var nota = leitor.nextDouble();
        //if/else aninhado(ninho, do inglês nest, aninhado: nested)
        if(nota >= 9){
            System.out.println("A");
            System.out.println("Parabéns");
        }
        else{
            if (nota >= 8) {
                System.out.println("B");    
            } 
            else {
                if (nota >= 7) {
                    System.out.println("C");    
                }
                else {
                    System.out.println("Estudar um pouco mais...");
                }
                
            }
        }        
        System.out.println("Programa terminando..");
    }    
}
//if/else encadeado
// if(nota >= 9){
//     System.out.println("A");
//     System.out.println("Parabéns");
// }
// else if(nota >= 8)
//     System.out.println("B");
// else if(nota >= 7)
//     System.out.println("C");
// else
//     System.out.println("Estudar um pouco");

// if(nota >= 6){
//     System.out.println("Aprovado");
//     System.out.println("Parabéns");
// }
// //dangling else
// else{
//     System.out.println("Estudar um pouco mais..");
//     System.out.println("E tirar dúvidas com o professor");
// }