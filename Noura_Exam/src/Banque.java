import java.util.ArrayList;
import java.util.HashMap;




/**
 * Cette classe représente une banque 
 * @author   HAFIDI IMAD
 */
public class Banque {
	/**
	 * Liste des clients, la clé est le numéro du client
	 */
	private HashMap<Integer, Client> mesClients;
	/**
	 * Nom de la banque
	 */
	private String nom;
	
	/**
	 * La méthode respecte les régles suivantes :
	 * 1-Le client ne doit pas exister 
	 * 2-Le numéro du client est généré automatiquement ( dernier numéro +1)
	 * @param nom
	 * @param age
	 * @param typeCompte
	 * @return false : si le client n'est pas ajouté
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
	 * La méthode ajoute un compte et l'attribue à un client
	 * @param client
	 * @param typeCompte
	 * @return false : si le compte n'est pas crée
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
	 * La méthode supprime un client si seulement si le solde de tous ses comptes 
	 * est zéro
	 * @param client
	 * @return false si le client est supprimé
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
	 * Cette méthode affiche les relvés bancaires d'un client pour une date précise(05/14)
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
