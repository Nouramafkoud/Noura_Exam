/**
 * Cette classe repr�sente une op�ration �l�mentaire dans un compte
 * @author   HAFIDI IMAD
 */
public class Operation {
	/**
	 * La date de l'op�ration sous la forme jj/mm/aa (05/12/14)
	 */
	private String Date;
	/**
	 * montant de l'op�ration 
	 */
	private Float montant;
	/**
	 * Le type d'op�ration 
	 */
	private TypeOperation type;
	
	
	public Operation() {
		super();
	}
	/**
	 * constructeur de la classe op�ration prend une date et un montant et initialise tous les attributs
	 * @param date
	 * @param montant
	 */
	public Operation(String date, Float montant) {
		super();
		// TODO
		this.Date=date;
		this.montant=montant;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	/**
	 * une m�thode qui return l'ann�e de la date 
	 * @return String
	 */
	public String getAnnee(){
		// TODO
		String[] date = this.Date.split("/");
		return date[2];
	}
	/**
	 * une m�thode qui return le mois de la date 
	 * @return String
	 */
	public String getMois(){
		// TODO
		String[] date = this.Date.split("/");
		return date[1];
	}
	/**
	 * une m�thode qui return le jour de la date 
	 * @return String
	 */
	public String getJour(){
		// TODO
		String[] date = this.Date.split("/");
		return date[0];
	}
	
		
}
