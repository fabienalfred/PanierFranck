package panier.metier;

public class Article {
	private String name;
	private int nb;
	private double prix;
	
	
	public Article(String name, int nb, double prix) {
		this.name = name;
		this.nb = nb;
		this.prix = prix;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNb() {
		return nb;
	}
	public void setNb(int nb) {
		this.nb = nb;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
}
