package com.irritec.presentation;

import com.irritec.dao.DaoImpl;
import com.irritec.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        DaoImpl dao = new DaoImpl();
        metier.setDao(dao);
        System.out.println("- - - - - - - - - - - - - - - LA PREMIERE VERSION- - - - - - - - - - - - - - ");
        System.out.println(metier.calcul());
    }
}
