
package ejercicios;


public class Problema5 {
    
    private void imprimir_divisores(int a){
        for (int i=1;i<a;i++){
            if (a % i == 0){
                System.out.println(i);
            }
        }
    }
    public void ejecutar_problema5(int num){
        imprimir_divisores(num);
    }
}
