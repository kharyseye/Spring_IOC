package com.SpringIOC.dao;

public class DaoImpl  implements IDao{
    @Override
    public double getData() {
        double tmp = Math.random()*40;
        return tmp;
    }
}
