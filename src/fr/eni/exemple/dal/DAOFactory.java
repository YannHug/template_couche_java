package fr.eni.exemple.dal;


import fr.eni.exemple.dal.jdbc.ExempleDAOJdbcImpl;

public class DAOFactory {

	public static ExempleDAO getBlagueDAO() {
		return new ExempleDAOJdbcImpl();
	}
	
}
