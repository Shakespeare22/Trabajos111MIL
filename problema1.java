package ejercicios;

// modificador de acceso public/privado/protected
// retorno (tipo de dato)
// nombre
// parametros ()
public class problema1 {
     
    
    public boolean es_primo (int a){
        boolean x;
        x = true;
        for(int i=2;i==(a/2) + 1;i++) {
            if ((a % i)==0){
                
                x = false;
            }        
        }
        
        return x;                        
    }
    public void ejecutar_problema1(int b){
        int j = 1;
        
        while (j!=b){
            if (es_primo(j)){
                System.out.println(j);
            }
            j++;
        }
            
        /*for (int j=1;j==b;j++){
            if (es_primo(j)) {
                System.out.println(j);
            }
        }*/
    }
    
    
}
