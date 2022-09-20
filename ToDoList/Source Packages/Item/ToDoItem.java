package Item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;


@XmlRootElement(name = "item")
@Entity
@Table(name="to_do_item")
public class ToDoItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "itemID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemID")
	private int itemID;
	
	@XmlElement(name = "description")
	@Column(name="description")
	private String itemDesc;
	
	public ToDoItem() {
		
	}
	
	//create an item
	public ToDoItem(String itemDesc){
		//this.itemID = itemID;
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
