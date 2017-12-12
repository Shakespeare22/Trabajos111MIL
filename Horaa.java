
package horaa;
import java.util.Scanner;
/*
 * @author Feresin Bruno
 */
public class Horaa {
    Scanner scan = new Scanner(System.in);
    private int hora;
    private int minuto;
    private int segundo;
    
    //Constructores
    
    public Horaa(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;        
    }
    public Horaa(int h, int m,int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;        
    }
    
    //Metodos
    public void leer(){
        hora = scan.nextInt();
        minuto = scan.nextInt();
        segundo = scan.nextInt();
    }
    
    public void valida (int h,int m,int s){
        
    }
    
    public void print (){
        System.out.println("("+hora+":"+minuto+":"+segundo+")");
    }
    
    public int aSegundos(){
        int sum = 0;
        sum += segundo+minuto*60+hora*60*60;
        return sum;
    }
    
    public void deSegundos (int segundos){
        hora = segundos / 3600;
        segundos -= segundos / 3600;
        minuto = segundos / 60;
        segundos -= segundos / 60;
        segundo = segundos;
    }
    public void siguiente(){
        segundo++;
    }
    public void anterior(){
        segundo--;
    }
    public boolean igualQue(Horaa hora){
        boolean igual = false;
        if ((hora.hora == this.hora) && (hora.minuto == this.minuto) && (hora.segundo == this.segundo)){
            igual = true;
        }
        return igual;
    }
    public boolean menorQue(Horaa hora){
        boolean menor = false;
        
        int actual = this.aSegundos();
        int ingresada = hora.aSegundos();
        if (actual < ingresada){
            menor = true;
        }
        return menor;
    }
    
    public boolean mayorQue(Horaa hora){
        boolean menor = false;
        int actual = this.aSegundos();
        int ingresada = hora.aSegundos();
        if (actual > ingresada){
            menor = true;
        }
        return menor;
    }
    
    /*public boolean equals(Object obj){
        if (obj instanceof Horaa){
            Horaa horac = (Horaa)obj;
            if (super.equals(horac) && this){
                
            }
        }
            
    }*/
    
    public static void main(String[] args) {
        Horaa hora = new Horaa(20,21,15);
        Horaa hora2 = new Horaa(20,21,15);
        
        if (hora.equals(hora2)){
            System.out.print("iguales"+"\n");
            
        }
    }
    
}
