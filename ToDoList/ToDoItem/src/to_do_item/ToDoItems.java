package to_do_item;

import java.util.ArrayList;
import java.util.List;

public class ToDoItems {
	private List<ToDoItem> items;
	
	//create itemlist
	public ToDoItems(){
		items = new ArrayList<>();
	}
	
	//add item to list
	public void addItem (String itemDesc) {
		items.add(new ToDoItem(itemDesc, (items.size() + 1)));
	}
	
	//delete item from list
	public void deleteItem (int itemID) {
		items.remove(itemID - 1);
	}
	
	//display list
	public void listItems() {
		if(items.isEmpty()) {
			System.out.println("List is Empty! \n Add Items to List");
		}
		for(ToDoItem item : items) {
			System.out.println(item.getItemID() + " - " + item.getItemDesc());
		}
	}
}
