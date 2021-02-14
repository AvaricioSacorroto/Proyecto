package logic;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @author Kevin(K7) & David Cacheiro & Héctor Fernández
 */
@Slf4j
public class Calculator {

    public static void multiplication() {
        log.info("Introduce un número: ");
        String num = new Scanner(System.in).next();
        for (int i = 0; i <= 10; i++) {
            try {
                log.info(num + "*" + i + "=" + Integer.parseInt(num) * i);
            } catch (Exception e) {
                log.error("Puta aprende a leer.");
                return;
            }
        }
    }

    public static void multiplication(int num) {
        for (int i = 0; i <= 10; i++) {
            log.info(num + "*" + i + "=" + num * i);
        }
    }

}
