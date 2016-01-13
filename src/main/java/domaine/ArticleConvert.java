package domaine;

import java.util.ArrayList;
import java.util.List;

import model.Article;
import model.Commande;


public class ArticleConvert {

	
	public static Article createModel(ArticleBean articleBean){
		Article com = new Article();
		com.setLibele(articleBean.getLibele());
		com.setDescription(articleBean.getDescription());
		com.setMontant(articleBean.getMontant());
		com.setQte(articleBean.getQte());
		return com;
	}

	
	public static List<ArticleBean> createArticleBeanList(List<Article> commds){
		List<ArticleBean> beans = new ArrayList<ArticleBean>();
		ArticleBean articleBean = null;
		for(Article com : commds){
			articleBean = new ArticleBean();
			
			articleBean.setIdC(com.getIdArticle());
			articleBean.setLibele(com.getLibele());
			articleBean.setDescription(com.getDescription());
			articleBean.setMontant(com.getMontant());
			articleBean.setQte(com.getQte());
			
			beans.add(articleBean);
		}
		return beans;
		
	}
	
	public static String convertArrayToCsv(String [] arr){
		StringBuilder csv = new StringBuilder("");
		for(String value : arr){
			csv.append(value).append(",");
		}
		return csv.toString();
	}
	public static String[] convertCsvToArr(String csv){
		String [] values = csv.split(",");
		return values;
	}
	
}
