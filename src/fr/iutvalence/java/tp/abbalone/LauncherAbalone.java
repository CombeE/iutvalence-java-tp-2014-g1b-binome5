package fr.iutvalence.java.tp.abbalone;

// TODO écrire un commentaire (done)


/**
 * Gestionnaire des classes assurant le bon déroulement d'une partie 
 * d'Abalone
 * 
 * @author combeer
 *
 */
public class LauncherAbalone
{

	/**
	 * Application lançant une partie
	 * @param args Argument de la classe main (il n'y en a aucun)
	 */
	public static void main(String[] args)
	{
		System.out.println("creation de la partie");
		Abalone partieDabalone = new Abalone();
		System.out.println("Debut de la partie");
		
		System.out.println(partieDabalone.toString());
		//partieDabalone.jouer();
		
		System.out.println("Fin de la partie");

	}

}
