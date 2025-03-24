package t3_sub2.estruturas_de_repeticao;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        //5 alunos
        //cálculo da média para cada um
        //cada aluno tem duas notas
        //operador de inferência de tipo
        //repetição controlada por contador
        //p + 0 = p
        int contador = 1;
        while (contador <= 5){
            double nota1, nota2;
            do{
                nota1 = parseDouble(showInputDialog("Nota 1 (Digite entre 0 e 10)"));
            }while(nota1 < 0 || nota1 > 10);
            do{
                nota2 = parseDouble(showInputDialog("Nota 2(Digite entre 0 e 10)"));
            }while(nota2 < 0 || nota2 > 10);
            contador++;
        }

        // int contador = 4;
        // do{
        //     System.out.println(contador);
        //     contador++;
        // }while(contador <= 3);
        // System.out.println(contador);
        
        
    }        
}
// int a = 1;
// a = a++ + 1;
// System.out.println(a);//3
// a = ++a + 1;
// System.out.println(a);
// a = a + 1;
// a += 1;
// a++; //pós incremento
// ++a; //pré incremento

//içamento: hoist
// double nota1;
// int contador = 1;
// for(;contador <= 3 ;){
//     var nota1 = parseDouble(showInputDialog("Primeira nota"));
//     var nota2 = parseDouble(showInputDialog("Segunda nota"));
//     var media = (nota1 + nota2) / 2;
//     showMessageDialog(
//         null, 
//         //teste ? valor1 : valor2
//         media >= 6 ? "Aprovado" : "Reprovado"
//     );
//     ++contador;
// }
// showMessageDialog(null, contador);

// showMessageDialog(null, "Acabou");
// int contador = 1;
// while(contador <= 3){
//     var nota1 = parseDouble(showInputDialog("Primeira nota"));
//     var nota2 = parseDouble(showInputDialog("Segunda nota"));
//     var media = (nota1 + nota2) / 2;
//     showMessageDialog(
//         null, 
//         //teste ? valor1 : valor2
//         media >= 6 ? "Aprovado" : "Reprovado"
//     );
//     contador = contador + 1;
// }

