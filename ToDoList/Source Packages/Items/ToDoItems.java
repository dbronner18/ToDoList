package Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bronner.util.HibernateUtil;

import Item.ToDoItem;

public class ToDoItems {
	
	public ToDoItems(){
	}
	
	//add item to list
	public int addItem (ToDoItem item) {
		//Injection Attack Example
		/*try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/to_do_list?allowMultiQueries=true";
			String username = "root";
			String pass = "Hockey18!";
			Class.forName(driver);
			
			//connect to database
			Connection connect = DriverManager.getConnection(url, username, pass);
			System.out.println("Connected");
			String itemDesc = item.getItemDesc();
			
			String query = "insert into to_do_list (description) values('{0}')";
			PreparedStatement ps = connect.prepareStatement("INSERT INTO to_do_item (description) VALUES ('" + itemDesc + "');");
			ps.execute();
		}
		catch(Exception e) {
			System.out.println(e);
		}*/
		
		
	
           Session session = HibernateUtil.getSessionFactory().openSession();
            //start a transaction
           Transaction transaction = session.beginTransaction();
            // save the student object
            session.save(item);
            // commit transaction
            transaction.commit();
            System.out.println("Item Added");
            session.close();
            return 1;
        
	}
	
	//delete item from list
	public int deleteItem (int itemID) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            ToDoItem item = session.get(ToDoItem.class, itemID);
            if (item != null) {
                session.delete(item);
                System.out.println("item is deleted\n");
            }

            // commit transaction
            transaction.commit();
            return 1;
        } catch (Exception e) {
           // if (transaction != null) {
            //    transaction.rollback();
            //}
            e.printStackTrace();
            return 0;
        }
	}
	
	//display list
	public List<ToDoItem> listItems() {
		Transaction transaction = null;
        List <ToDoItem> listItems = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            Query query = session.createQuery("FROM ToDoItem");
            
            listItems = query.list();
            // commit transaction
            transaction.commit();
            System.out.println("List Showing");
        } catch (Exception e) {
            //if (transaction != null) {
                //transaction.rollback();
           // }
            e.printStackTrace();
        }
        return listItems;
	}
}
