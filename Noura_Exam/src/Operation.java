/**
 * Cette classe représente une opération élémentaire dans un compte
 * @author   HAFIDI IMAD
 */
public class Operation {
	/**
	 * La date de l'opération sous la forme jj/mm/aa (05/12/14)
	 */
	private String Date;
	/**
	 * montant de l'opération 
	 */
	private Float montant;
	/**
	 * Le type d'opération 
	 */
	private TypeOperation type;
	
	
	public Operation() {
		super();
	}
	/**
	 * constructeur de la classe opération prend une date et un montant et initialise tous les attributs
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
	 * une méthode qui return l'année de la date 
	 * @return String
	 */
	public String getAnnee(){
		// TODO
		String[] date = this.Date.split("/");
		return date[2];
	}
	/**
	 * une méthode qui return le mois de la date 
	 * @return String
	 */
	public String getMois(){
		// TODO
		String[] date = this.Date.split("/");
		return date[1];
	}
	/**
	 * une méthode qui return le jour de la date 
	 * @return String
	 */
	public String getJour(){
		// TODO
		String[] date = this.Date.split("/");
		return date[0];
	}
	
		
}
