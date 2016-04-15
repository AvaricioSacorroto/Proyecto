/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Kevin(K7)
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, c=0;
        System.out.println("Introduce un numero");
        Scanner num= new Scanner(System.in);
        n=num.nextInt();
        for(c=0;c<=10;c=c+1)
            System.out.println(n+"*"+c+"="+n*c);
    }
    
}
