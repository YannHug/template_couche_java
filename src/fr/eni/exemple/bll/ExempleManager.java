package fr.eni.exemple.bll;

import fr.eni.exemple.dal.ExempleDAO;
import fr.eni.exemple.dal.DAOFactory;

public class ExempleManager {
    private static ExempleManager instance;

    public static ExempleManager getInstance() {
        if (instance == null) {
            instance = new ExempleManager();
        }
        return instance;
    }

    private ExempleManager() {
    }

    private ExempleDAO exempleDAO = DAOFactory.getExempleDAO();


}
