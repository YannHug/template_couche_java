package fr.eni.exemple.dal;

import fr.eni.exemple.bo.Exemple;

import java.util.List;

public interface ExempleDAO {
    List<Exemple> selectAll();

    Exemple selectAleatoire();

    List<Exemple> top3Blagues();

    void update(Exemple exemple);

    void insert(Exemple exemple);

}
