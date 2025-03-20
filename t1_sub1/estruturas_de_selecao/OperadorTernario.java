package t1_sub1.estruturas_de_selecao;

public class OperadorTernario {
    public static void main(String[] args) {
        //decidir se uma pessoa pode dirigir
        //nome completamente qualificado
        //fully qualified name
        var idade = java.lang.Integer.parseInt(args[0]);
        //atribuindo numa variável
        var podeDirigir = idade >= 18 ? "Pode dirigir" : "Não pode dirigir";
        System.out.println(podeDirigir);
        //direto no syso
        System.out.println(idade >= 18 ? "Pode dirigir" : "Não pode dirigir");
        // if(idade >= 18){
        //     System.out.println("Pode dirigir");
        // }
        // else{
        //     System.out.println("Não pode dirigir");
        // }
    }    
}
