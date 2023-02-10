﻿# Template de base pour projet en couche Java
 
 Synthese de cours ENI.
 
 - Penser à mettre le pilote JDBC en lien. Il se trouve dans le dossier ``lib``
 - Changer le package ``fr.eni.exemple`` par le votre.
 - Modifier le fichier ``settings.properties`` avec les accès à la base de données (Mot de passe, user, nom de la base de données).
 - Remplacer le fichier ``Exemple`` dans le package BO par une vraie classe
 - Mettre à jour l'interface ``ExempleDao`` dans la DAL
 - Changer le fichier ``ExempleDAOJdbcI`` avec le CRUD souhaité
 - Modifier le ``ExempleManager`` pour faire les tests de verifications avant envoie en BDD
 
_Les Fichiers ".gitignore" peuvent etre supprimer, servent juste à poussser le projet entier sur git_
