/*

 */
package lista01_ex04;

public class Lampada {
    
    private boolean ligada;
    
    public void ligar(){
        this.ligada = true;
    }
    
    public void desligar(){
        this.ligada = false;
    }
    
    public String verificarEstado(){
        if(this.ligada)
            return "Ligada";
        
        return "Desligada";
    }
    
}
