package t3_sub2.estruturas_de_selecao;

public class SwitchCase {
    public static void main(String [] args) { //array
        // operador de inferência de tipo (Java 10+)
        var nota = Integer.parseInt(args[0]);
        // fall-through
        switch(nota){
            case 10, 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("Estudar um pouco mais");
                break;
        }
    }
}
