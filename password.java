/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.*;
import java.io.*;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import java.math.*;

/**
 *
 * @author Lenovo
 */
public class password {

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int cont = 0;
        boolean mayus = false, lower = false, num = false, ocho = false;
        for(int i = 0;i<S.length();i++){
            if (isUpperCase(S.indexOf(i))){
                mayus = true;
            }
             if (isLowerCase(S.indexOf(i))){
                mayus = true;
            }
             if (S.length()==7){
                mayus = true;
            }
             if (Character.isDigit(S.indexOf(i))){
                mayus = true;
            }
            
            }
        if (((mayus) && (lower)) && ((num) && (ocho))){
        System.out.println("true");
        }else{
            System.out.println("false");
    }
        
}   
    }


