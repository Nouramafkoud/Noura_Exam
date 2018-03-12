import java.util.ArrayList;
import java.util.Iterator;

public class CompteEpargne extends Compte{
	private Double interet ;

	
	public CompteEpargne(Integer numero, Float solde) {
		super(numero, solde);
	}
	@Override
	/**
	 * Cette m�thode doit respecter les r�gles m�tier suivantes :
	 * O- Verifier que le client n'est pas d�ja signataire
	 * 1-Les signataires doivent avoir le m�me nom de famille
	 * 2-Le nombre de signataire ne doit pas d�passer 3
	 * 3-L'interet est calcul� par la moyenne d'interer offert de chaque tranche 
	 * d'age des signataires ( 5% pour les mineurs, 4% de 18 � 25, 3.5 de 25 � 40 , 
	 * 3% de 40 � 60 et 2.5 pour le reste)
	 */
	public boolean addSignataires(Client client) {
		//TODO
		ArrayList<Client> cl = new ArrayList();
		cl = super.getSignataires();
		if(!super.getSignataires().contains(client)) {
			if(cl.size()<3) {
				for(int i=0;i<cl.size();i++) {
					if(cl.get(i).getNom().compareTo(client.getNom())!=0) {
						return false;
					}
				}
			}
		}
		return false;
	}
	/**
	 * Cette m�thode suuprime un signataire  et recalcule l'interet du compte
	 */
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
	 * Cette m�thode ajoute une op�ration en respectant les r�gles suivantes :
	 * 1- Pour un d�bit :  la somme ne doit jamais d�passer le solde
	 * 2- Pour un cr�dit : l'op�ration est permise seulement en anniversaire du compte
	 * 3- La m�thode doit recalculer le solde
	 */
	@Override
	public boolean addOperation(Operation operation) {
		// TODO Auto-generated method stub
		ArrayList<Operation> ol = new ArrayList();
		ol = super.getOperation();
		
		
		return false;
	}
	/**
	 * Calcul l'interet et ajoute la somme au solde
	 */
	public void addIntert(){
		//TODO
	}
}
