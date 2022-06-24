package com.gordinhos.horadosistema;

import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        Date calendario = new Date ();
        System.out.print("A hora do exercício é ");
        System.out.println(calendario.toString());
        System.out.print("O idioma desse Windows é ");
        System.out.println(loc.getDisplayLanguage());
        System.out.println("FIM");
    }
}
