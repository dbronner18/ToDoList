package to_do_item;

public class ToDoItem {
	private int itemID;
	private String itemDesc;
	
	//create an item
	public ToDoItem(String itemDesc, int itemID){
		this.itemID = itemID;
		this.itemDesc = itemDesc;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
}
