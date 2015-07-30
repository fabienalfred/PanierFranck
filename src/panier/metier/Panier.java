package panier.metier;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	private List<Article> articles = new ArrayList<>();
	
	public void add(Article article){
		articles.add(article);
	}
	
	public void remove(Article article){
		articles.remove(article);
	}
	
	public void removeAll(){
		articles.clear();
	}
	
	public int count(){
		return articles.size();
	}
	
	public List<Article> getArticles(){
		return articles;
	}
}
