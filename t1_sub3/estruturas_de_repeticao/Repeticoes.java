package t1_sub3.estruturas_de_repeticao;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static java.lang.String.format;
public class Repeticoes {
    public static void main(String[] args) {
        //while, for, do/while
        double nota1, nota2, media;
        //controlada por contador
        int aluno = 1;
        while(aluno <= 3){
            do{
                nota1 = parseDouble(showInputDialog("Digite a nota 1"));
            }while(nota1 < 0 || nota1 > 10);

            nota2 = parseDouble(showInputDialog("Digite a segunda nota"));
            while(!(nota2 >= 0 && nota2 <= 10)){
                nota2 = parseDouble(showInputDialog("Digite a segunda nota"));
            }
            media = (nota1 + nota2) / 2;
            if(media >= 6)
                showMessageDialog(null, "Aprovado");
            else
                showMessageDialog(null, "Reprovado");
            //Sua média é: 
            showMessageDialog(null, format("Sua média é %.2f", media));
            aluno++;
        }
    }    
}
// int i = 4;
// do{
//     System.out.println(i);
//     ++i;
// }while(false);
// System.out.println("Acabou");
// int a = 1;
// System.out.println(a); //1
// a = a - 1;
// System.out.println(a);//2
// a -= 1;
// System.out.println(a);//3
// a--; //pós incremento
// System.out.println(a);//4
// --a; //pré incremento
// System.out.println(a);//5
// System.out.println(a--);//5
// System.out.println(a);//6
// System.out.println(--a);//7
// for(int cont = 1;cont <= 2; cont = cont + 1){
//     nota1 = parseDouble(showInputDialog("Digite a primeira nota"));
//     nota2 = parseDouble(showInputDialog("Digite a segunda nota"));
//     media = (nota1 + nota2) / 2;
//     showMessageDialog(
//         null, 
//         media >= 6 ? "Aprovado" : "Reprovado"
//     );
// }

// while(cont <= 3){
//     nota1 = parseDouble(showInputDialog("Digite a primeira nota"));
//     nota2 = parseDouble(showInputDialog("Digite a segunda nota"));
//     media = (nota1 + nota2) / 2;
//     showMessageDialog(
//         null, 
//         media >= 6 ? "Aprovado" : "Reprovado"
//     );
//     cont = cont + 1;
// }