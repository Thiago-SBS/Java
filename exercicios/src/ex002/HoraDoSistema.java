package ex002;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class HoraDoSistema {
    public static void main (String[] ar) {
        LocalDateTime data = LocalDateTime.now();
        System.out.println("A hora do sistema é");
        System.out.println(data.toString());
    }
}
