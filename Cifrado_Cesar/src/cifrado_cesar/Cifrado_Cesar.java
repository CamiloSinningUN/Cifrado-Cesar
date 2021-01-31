/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado_cesar;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Cifrado_Cesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la palabra a cifrar");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Cifrado es: "+cifrar(text));
    }

    private static String cifrar(String text) {
       String cifrado = "";
       
       char v[] = text.toCharArray();
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 'z'){
                v[i] = 'a';
            }else if(v[i]!= ' '){
                v[i]++;
            }                            
            cifrado = cifrado.concat(String.valueOf(v[i]));
        }
       return cifrado;
    }
    
}
