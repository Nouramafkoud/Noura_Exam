
public class CompteCourant extends Compte{
	/**
	 * le solde Max est une valeur négative que le compte ne doit jamais dépasser
	 */
	private Float soldeMax;
	
	public CompteCourant(Integer numero, Float solde, Float soldeMax) {
		super(numero, solde);
		this.soldeMax = soldeMax;
	}

	@Override
	/**
	 * Le  nombre de signataire ne doit jamais dépasser 4
	 */
	public boolean addSignataires(Client client) {
		// TODO Auto-generated method stub
		if(super.getSignataires().size()<4) {
			super.getSignataires().add(client);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeSignataires(Integer id) {
		// TODO Auto-generated method stub
		if(super.getSignataires().contains(super.getSignataires().get(id))) {
			super.getSignataires().remove(id);
			return true;
		}
		return false;
	}
	/**
	 * Recalcule le solde 
	 */
	@Override
	public boolean addOperation(Operation operation) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Une méthode qui affiche le relvé d'un mois pour une année (5/14)
	 */
	public void afficheReleveCourant(String mois, String anne){
		
	}
		
	/**
	 * Une méthode qui affiche la somme des opérations de Débit d'un mois 
	 * pour une année (5/14)
	 */
	public void afficheDebitCourant(String mois, String annee){

	}
	/**
	 * Une méthode qui affiche la somme des opérations de Crédit d'un mois 
	 * pour une année (5/14)
	 * @param mois
	 * @param année
	 */
	public void afficheCreditCourant(String mois, String annee){
			
	}

	
}
