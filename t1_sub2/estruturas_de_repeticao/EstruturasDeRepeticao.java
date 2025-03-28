package t1_sub2.estruturas_de_repeticao;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        //for, while, do/while
        double nota1, nota2, media;
        //estrutura de repetição controlada por contador
        //contar de 1 a 3
        final int QTDE_ALUNOS = 5;
        int aluno = 1;
        while(aluno <= QTDE_ALUNOS){
            do{
                nota1 = parseDouble(showInputDialog("Nota 1"));
            }while(nota1 < 0 || nota1 > 10);
            do{
                nota2 = parseDouble(showInputDialog("Nota 2"));
            }while(!(nota2 >= 0 && nota2 <= 10));
            ++aluno;
        }
        
        
        
    }    
}
// int cont = 1;
// System.out.println(cont);//1
// cont = cont - 1;
// System.out.println(cont);//0
// cont -= 1;
// System.out.println(cont);//-1
// cont--; //pós incremento
// System.out.println(cont);//-2
// --cont; //pré incremento
// System.out.println(cont);//-3
// System.out.println(cont--);//-3
// System.out.println(cont);//-4
// System.out.println(--cont);//-5
// int contador = 4;
// do{
//     System.out.println(contador);
//     contador = contador + 1;
// }while(contador <= 3);
// System.out.println(contador);
// // System.out.println(contador);
// System.out.println("Acabou");
// for(int contador = 1; contador <= 3;cont++){
    //     nota1 = parseDouble(showInputDialog("Nota 1"));
//     nota2 = parseDouble(showInputDialog("Nota 2"));
//     media = (nota1 + nota2) / 2;
//     if(media >= 6)
//         showMessageDialog(null, "Aprovado");
//     else
//         showMessageDialog(null, "Reprovado");
// }
// int contador = 1;
// while(contador <= 3){
//     nota1 = parseDouble(showInputDialog("Nota 1"));
//     nota2 = parseDouble(showInputDialog("Nota 2"));
//     media = (nota1 + nota2) / 2;
//     if(media >= 6)
//         showMessageDialog(null, "Aprovado");
//     else
//         showMessageDialog(null, "Reprovado");
//     contador = contador + 1;
// }
