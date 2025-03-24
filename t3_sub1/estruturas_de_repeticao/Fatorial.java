package t3_sub1.estruturas_de_repeticao;

// n! = n * (n-1) * (n-2) * ... * 1
// p * 1 = p
public class Fatorial {
    public static void main(String[] args) {
        int n = 5;
        int fat = 1;
        int cont = 1;
        while(cont <= n){
            fat = fat * cont;
            cont++;
        }
        System.out.println(fat);
    }
}
