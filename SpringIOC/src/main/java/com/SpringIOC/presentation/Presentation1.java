package com.SpringIOC.presentation;

import com.SpringIOC.dao.DaoImpl;
import com.SpringIOC.dao.DaoImpl2;
import com.SpringIOC.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {

        /*
        Injection des dependances par instanciation statique => new
         */

        MetierImpl metier = new MetierImpl();
        DaoImpl2 dao = new DaoImpl2();
        metier.setDao(dao);
        System.out.println("- - - - - - - - - - - - - - - LA PREMIERE VERSION- - - - - - - - - - - - - - ");
        System.out.println(metier.calcul());
    }
}
