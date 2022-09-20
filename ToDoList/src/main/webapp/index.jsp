<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <title>To Do Item</title>
</head>
<body>
  <h1>Home</h1>
        <h2>
         <input type="button" value="Add Item" onclick="window.location='addItem.jsp'" > <br><br>
         <input type="button" value="Delete Item" onclick="window.location='deleteItem.jsp'" >
        </h2>
        <form action="ItemController" method="POST">
        	<table>
        		<tr>
        			<td>
        				<input type="submit" name="show" value="Show Items">
        			</td>
        		</tr>
        	</table>
        </form>
</body>
</html>