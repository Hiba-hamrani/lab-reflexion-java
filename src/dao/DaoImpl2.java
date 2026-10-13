package dao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("[DAO2] Récupération de la valeur depuis une autre source de données...");
        return 50.0;
    }
}