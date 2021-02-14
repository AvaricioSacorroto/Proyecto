package logic;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @author Kevin(K7) & David Cacheiro & Héctor Fernández
 */
@Slf4j
public class Calculator {

    public static void multiplication() {
        String n;
        log.info("Introduce un número: ");
        Scanner num = new Scanner(System.in);
        n = num.next();
        for (int i = 0; i <= 10; i++) {
            try {
                log.info(n + "*" + i + "=" + Integer.parseInt(n) * i);
            } catch (Exception e) {
                log.error("Puta aprende a leer.");
                return;
            }
        }
    }

}
