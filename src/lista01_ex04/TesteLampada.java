package lista01_ex04;

public class TesteLampada {

    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();
        
        l1.ligar();
        l2.desligar();
        
        if(l1.verificarEstado().equals("Ligada"))
            System.out.println("L1 esta ligada\n");
        else
            System.out.println("L1 esta desligada\n");
        
        if(l2.verificarEstado().equals("Ligada"))
            System.out.println("L2 esta ligada");
        else
            System.out.println("L2 esta desligada");
    }
}