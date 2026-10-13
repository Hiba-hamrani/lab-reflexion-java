package presentation;

import dao.DaoImpl;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {

    static IMetier metier;

    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();              // instanciation en dur avec new
        MetierImpl metierImpl = new MetierImpl();
        metierImpl.setDao(dao);                   // injection manuelle
        metier = metierImpl;

        System.out.println("Résultat = " + metier.calcul());
    }
}