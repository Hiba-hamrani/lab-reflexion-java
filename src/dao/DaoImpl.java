package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData()  {
        System.out.println("[DAO] Récupération de la valeur depuis la source de données...");
        return 100.0;
    }
}