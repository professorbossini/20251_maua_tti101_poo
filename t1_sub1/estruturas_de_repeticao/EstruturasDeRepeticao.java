package t1_sub1.estruturas_de_repeticao;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
public class EstruturasDeRepeticao{
    public static void main(String[] args) {
        final int QTDE_ALUNOS = 5;
        double nota1, nota2, media;
        int aluno = 1;
        while(aluno <= QTDE_ALUNOS){
            do{
                nota1 = parseDouble(showInputDialog("Nota 1"));
            }while(nota1 < 0 || nota1 > 10);

            do{
                nota2 = parseDouble(showInputDialog("Nota 2"));
            }while(!(nota2 >= 0 && nota2 <= 10));
            media = (nota1 + nota2) / 2;
            if(media >= 6)
                showMessageDialog(null, "Aprovado");
            else
                showMessageDialog(null, "Reprovado");
            aluno++;
        }
        // var i = 4;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i <= 3); 
        // System.out.println(i);   
    }    
}

// public class EstruturasDeRepeticao {
//     public static void main(String[] args) {
//         // int a = 5, b = 2;
//         // int resultado = a / b;
//         // double d1 = 5,  d2 = 2;
//         // double resultado2 = d1 / d2;
//         // double eAgora = a / (double)b;
//         // double eAgora2 = (a * 1.0) / b;

//         //while, for, do/while
//         double nota1, nota2, media;
//         //repetição controlada por contador
//         int a = 1;
//         System.out.println(a);//1
//         a = a - 1;
//         System.out.println(a);//2
//         a -= 1;
//         System.out.println(a);//3 
//         a--; //pós incremento
//         System.out.println(a);//4
//         --a; //pré incremento
//         System.out.println(a);//5
//         System.out.println(a--);//5
//         System.out.println(--a);//7

//     }
// }
// for(int i = 1; i < 10; i++){
    // System.out.println("oi"); 
// }
// int contador = 1;
// while(true){
//     nota1 = parseDouble(showInputDialog("Digite a nota 1"));
//     nota2 = parseDouble(showInputDialog("Digite a nota 2"));
//     media = (nota1 + nota2) / 2;
//     showMessageDialog(
//         null,
//         media >= 6 ? "Aprovado" : "Reprovado"
//     );
//     contador = contador + 1;
// }
// System.out.println(contador);
// System.out.println("Acabou");
// int contador = 1;
// while(contador <= 3){
//     nota1 = parseDouble(showInputDialog("Digite a nota 1"));
//     nota2 = parseDouble(showInputDialog("Digite a nota 2"));
//     media = (nota1 + nota2) / 2;
//     showMessageDialog(
//         null,
//         media >= 6 ? "Aprovado" : "Reprovado"
//     );
//     contador = contador + 1;
// }
