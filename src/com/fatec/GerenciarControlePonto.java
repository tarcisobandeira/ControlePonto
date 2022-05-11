package com.fatec;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
        Gerente g = new Gerente(1, "Roberto", "robs@gmail.com", "995542", "robis125", "123");
        Secretaria s = new Secretaria(2, "Sandrinha", "san@gmail.com", "22514", "9944444551", "461");
        Operador o = new Operador(3, "Antonio", "antoni@gmail.com", "225147895", 6.21);

        RegistroPonto r1, r2, r3;

        r1 = new RegistroPonto(12547, g, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(r1.toString());
        Thread.sleep(4211);

        r2 = new RegistroPonto(6245, s, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(r2.toString());
        Thread.sleep(3221);

        r3 = new RegistroPonto(1444, o, LocalDate.now(), LocalDateTime.now(), null);
        System.out.println(r3.toString());
        Thread.sleep(1445);

        r1.setHoraSaida(LocalDateTime.now());
        System.out.println(r1.toString());
        Thread.sleep(2155);

        r2.setHoraSaida(LocalDateTime.now());
        System.out.println(r2.toString());
        Thread.sleep(6112);

        r3.setHoraSaida(LocalDateTime.now());
        System.out.println(r3.toString());
    }
}
