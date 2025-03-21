package t3_sub1.estruturas_de_selecao;
public class SwitchCase {
    public static void main(String[] args) {
        // operador de inferência de tipo
        var nota = Integer.parseInt(args[0]);
        // fall-through
        switch(nota){
            case 10:
                System.out.println("Parabéns");
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
            default:
                System.out.println("Estudar um pouco mais");
        }
    }
}
