
package ejercicios;


public class Problema2 {
   
    public float conversion(float a){
        return a / 18;
        
    }
    
    public void ejecutar_problema2 (float pesos){
        System.out.println("son: US$" + conversion(pesos));
    }
}
