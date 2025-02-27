package com.springioc.dao;

public class DaoImpl2 implements IDao{
    @Override
    public double getData() {
        System.out.println("- - - - - - - - - VERSION CAPTEUR - - - - - - - - - ");
        double temp = 80;
        return temp;
    }
}
