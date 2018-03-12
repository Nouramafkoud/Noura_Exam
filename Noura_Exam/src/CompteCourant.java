
public class CompteCourant extends Compte{
	/**
	 * le solde Max est une valeur n�gative que le compte ne doit jamais d�passer
	 */
	private Float soldeMax;
	
	public CompteCourant(Integer numero, Float solde, Float soldeMax) {
		super(numero, solde);
		this.soldeMax = soldeMax;
	}

	@Override
	/**
	 * Le  nombre de signataire ne doit jamais d�passer 4
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
	 * Une m�thode qui affiche le relv� d'un mois pour une ann�e (5/14)
	 */
	public void afficheReleveCourant(String mois, String anne){
		
	}
		
	/**
	 * Une m�thode qui affiche la somme des op�rations de D�bit d'un mois 
	 * pour une ann�e (5/14)
	 */
	public void afficheDebitCourant(String mois, String annee){

	}
	/**
	 * Une m�thode qui affiche la somme des op�rations de Cr�dit d'un mois 
	 * pour une ann�e (5/14)
	 * @param mois
	 * @param ann�e
	 */
	public void afficheCreditCourant(String mois, String annee){
			
	}

	
}
