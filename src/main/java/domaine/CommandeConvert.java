package domaine;

import java.util.ArrayList;
import java.util.List;

import model.Commande;

public class CommandeConvert {

	public static Commande createModel(CommandeBean commandeBean){
		Commande com = new Commande();
		com.setClient(commandeBean.getClient());
		com.setArticle(commandeBean.getArticle());

		return com;
	}

	
	public static List<CommandeBean> createCommandeBeanList(List<Commande> commds){
		List<CommandeBean> beans = new ArrayList<CommandeBean>();
		CommandeBean commandeBean = null;
		for(Commande com : commds){
			commandeBean = new CommandeBean();
			
			commandeBean.setArticle(com.getArticle());
			commandeBean.setClient(com.getClient());
			
			
			beans.add(commandeBean);
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
