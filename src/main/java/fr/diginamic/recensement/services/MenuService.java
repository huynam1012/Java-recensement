package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.exceptions.CodeDeptInvalideException;
import fr.diginamic.recensement.exceptions.InvalidInputException;
import fr.diginamic.recensement.exceptions.UserException;

/**
 * Classe représentant un service
 * 
 * @author DIGINAMIC
 *
 */
public abstract class MenuService {

	/**
	 * Méthode abstraite de traitement que doivent posséder toutes les méthodes de
	 * services
	 * 
	 * @param lignes  lignes du fichier
	 * @param scanner scanner
	 * @throws UserException exception générée lorque l'utilisateur saisit n'importe
	 *                       quoi
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner) throws UserException;
}
