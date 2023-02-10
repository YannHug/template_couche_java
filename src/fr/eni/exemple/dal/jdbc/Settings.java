package fr.eni.exemple.dal.jdbc;

import java.util.Properties;

/**
 * Classe permettant de charger un fichier de configuration et de récupérer les valeurs qu'il contient.
 * @author Jonathan
 *
 */
public class Settings {

	private static Properties properties;
	
	//bloc static : appelé 1 fois et 1 seule fois lors du premier appel (soit nouvelle instance, soit appel à un attribut static, soit appel à une fonction static)
	static {
		//chargement du fichier .properties
		try {
			properties = new Properties();
			properties.load(Settings.class.getResourceAsStream("settings.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
	
}
