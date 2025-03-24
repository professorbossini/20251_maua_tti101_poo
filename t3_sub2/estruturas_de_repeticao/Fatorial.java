package t3_sub2.estruturas_de_repeticao;

// n! = n * (n-1) * (n-2) * ... * 1
public class Fatorial {
    public static void main(String[] args) {
        int n = 5;
        //acumulador
        //p * 1 = p
        int fatorial = 1;
        for(int cont = 2; cont <= n; cont += 1){
            // fatorial = fatorial * cont;
            fatorial *= cont;
        }
        System.out.println(fatorial);     
    }    
}
