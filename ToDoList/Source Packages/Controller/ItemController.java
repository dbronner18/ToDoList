package Controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Item.ToDoItem;
import Items.ToDoItems;


public class ItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ToDoItems items = new ToDoItems();

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in GET");

		if(request.getParameter("add") != null) {
			String itemDesc = request.getParameter("itemDesc");
	        ToDoItem newItem = new ToDoItem(itemDesc);
	        items.addItem(newItem);
	        response.sendRedirect("/ToDoList/index.jsp");
		}
		
		if(request.getParameter("delete") != null) {
			int itemID = Integer.parseInt(request.getParameter("itemID"));
	        items.deleteItem(itemID);
	        response.sendRedirect("/ToDoList/index.jsp");
		}
		
		if(request.getParameter("show") != null) {
			List <ToDoItem> listItems = items.listItems();
	        request.setAttribute("listItems", listItems);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("showItems.jsp");
	        dispatcher.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
