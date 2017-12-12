
package ejercicios;


public class Problema3 {
    
    public int contar_cifras(int a){
        int aux = a;
        int cont = 1;        
        while (aux > 9){
            cont++;
            aux = aux / 10;
            
        }
        return cont;
    }
    
    public void ejecutar_problema3(int b){
        System.out.println(contar_cifras(b));
        
}
}
