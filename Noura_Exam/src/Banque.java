import java.util.ArrayList;
import java.util.HashMap;




/**
 * Cette classe repr�sente une banque 
 * @author   HAFIDI IMAD
 */
public class Banque {
	/**
	 * Liste des clients, la cl� est le num�ro du client
	 */
	private HashMap<Integer, Client> mesClients;
	/**
	 * Nom de la banque
	 */
	private String nom;
	
	/**
	 * La m�thode respecte les r�gles suivantes :
	 * 1-Le client ne doit pas exister 
	 * 2-Le num�ro du client est g�n�r� automatiquement ( dernier num�ro +1)
	 * @param nom
	 * @param age
	 * @param typeCompte
	 * @return false : si le client n'est pas ajout�
	 */
	public boolean addClient(String nom,String prenom, Integer age){
		Integer numero = this.mesClients.size()+1;
		Client client =new Client(nom,prenom,numero);
		client.setAge(age);
		if(!this.mesClients.containsValue(client)) {
			this.mesClients.put(numero, client);
			return true;
		}
		return false;
	}
	/**
	 * La m�thode ajoute un compte et l'attribue � un client
	 * @param client
	 * @param typeCompte
	 * @return false : si le compte n'est pas cr�e
	 */
	public boolean addCompte(Client client, String typeCompte){
		if (typeCompte=="CompteCourant")
		{
			Float solde=null;
			Float soldeMax = null;
			Compte newCompte=new CompteCourant(client.mesComptes.size(),solde,soldeMax);
			client.mesComptes.add(newCompte);
			return true;
		}else if (typeCompte=="CompteEpargne")
		{
			Float solde=null;
			Compte newCompte=new CompteEpargne(client.mesComptes.size(),solde);
			client.mesComptes.add(newCompte);
			return true;
		}else {
			return false;	
		}
	}
	/**
	 * La m�thode supprime un client si seulement si le solde de tous ses comptes 
	 * est z�ro
	 * @param client
	 * @return false si le client est supprim�
	 */
	public boolean removeClient(Client client) {
		//TODO
		ArrayList<Compte> compte = client.mesComptes;
		for(int i=0;i< compte.size();i++) {
			if(compte.get(i).getSolde()!=0) {
				return false;
			}
		}
		this.mesClients.remove(getKeyFromValue(this.mesClients,client));
		return true;
	}
	/**
	 * retourne la valeur d'une cle depuis une valeur
	 */
	public static Object getKeyFromValue(HashMap hm, Object value) {
	    for (Object o : hm.keySet()) {
	      if (hm.get(o).equals(value)) {
	        return o;
	      }
	    }
	    return null;
	  }
	/**
	 * Cette m�thode affiche les relv�s bancaires d'un client pour une date pr�cise(05/14)
	 * @param id
	 */
	public void afficheTousComptesClient(Integer id, String mois, String anne){
		
		for (int i=0; i<mesClients.size();i++)
		{
			ArrayList mesClients = (ArrayList) mesClients.get(i);
			for (int j=0; j<mesClients.size();j++)
	                {
	                    System.out.println(mesClients.get(j)+"\n");
	 
	                }
	        }
		
		
		//TODO
		
	}

}
