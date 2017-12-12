package ejercicios;

public class Problema6 {
    private int suma_impares(int a){
        int suma = 0;
        for (int i=1;i<=a;i+=2){
            suma = suma + i;
            
        }
        return suma;
    }
    public void ejecutar_problema6(int num){
        System.out.println(suma_impares(num));
    }
}
