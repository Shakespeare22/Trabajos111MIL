
package ejercicios;


public class Problema4 {

    public void piramide(int a){
        for(int i=a; i>=1;i-=1){
            for (int j=1;j<=a-i;j++){
                System.out.print(" ");
            }    
            for (int k = 1;k<=((i * 2)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int ejecutar_problema4(int num){
        piramide(num);
        if (num>0){
            return 0;
        }
        else{
            return -1;
        }
        
        
    }
}
