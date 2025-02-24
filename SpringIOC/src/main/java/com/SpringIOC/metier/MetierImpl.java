package com.SpringIOC.metier;

import com.SpringIOC.dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao;

    @Override
    public double calcul() {
        double temps = dao.getData();
        double result = temps * 0.5;
        return result;
    }

    /**
     * Définit le nom de l'utilisateur.
     *
     * @param dao Le nom de l'utilisateur.
     */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
