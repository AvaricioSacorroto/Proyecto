/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 * @author Kevin(K7) & David Cacheiro & Héctor Fernández
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n;
        System.out.println("Introduce un número: ");
        Scanner num = new Scanner(System.in);
        n = num.next();
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(n + "*" + i + "=" + Integer.parseInt(n) * i);
            } catch (Exception e) {
                System.out.println("Puta aprende a leer.");
                return;
            }
        }
    }

}
