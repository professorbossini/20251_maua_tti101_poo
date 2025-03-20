package t1_sub1.estruturas_de_selecao;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class EquacaoDoSegundoGrau {
    //and: &&
    //not: !
    //or: ||
    public static void main(String[] args) {
        var a = Double.parseDouble(args[0]);
        var b = Double.parseDouble(args[1]);
        var c = Double.parseDouble(args[2]);
        //ax^2 + bx + c = 0
        if(a == 0){
            System.out.println("Não é uma equação de segundo grau");
        }
        else{
            var delta = pow(b, 2) - 4 * a * c;
            if(delta > 0){
                var r1 = (b * -1 + sqrt(delta)) / (2 * a);
                var r2 = (-b - sqrt(delta)) / (a * 2);
                System.out.println("Duas raizes: " + r1 + ", " + r2);

            }
            else if (delta == 0){
                var r1 = (-1 * b) / (2 * a);
                System.out.println("Uma raiz: " + r1);
            }
            else{
                System.out.println("Não tem raiz");
            }
        }
    }
}
