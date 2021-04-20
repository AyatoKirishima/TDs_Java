package librairie;

import java.util.ArrayList;
import java.util.Iterator;

public class StockDocument {
	public ArrayList<Document> list;

	public StockDocument(){
        list = new ArrayList<>();
    }
	
	public void AddDocument(Document file) {
		list.add(file);
	}

	public void AfficherDocuments() {
		
		Iterator <Document> i = list.iterator();
		while(i.hasNext()) {
			System.out.println("["+i.next()+"]");
		}
	}
	
	public void AfficherAuteurs() {
		
	}
	
	
	public ArrayList<Document> getList() {
		return list;
	}

	public void setList(ArrayList<Document> list) {
		this.list = list;
	}
}
