<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Item</title>
</head>
	<body>
		<form action="ItemController" method="POST">
			<table>
				<tr>
					<td>Item Description: </td>
					<td><input type="text" name="itemDesc"></td>
				</tr>
				<tr>
                    <td><input type="submit" name="add" value="Add"></td>
                </tr>
                <tr>
                	<td><input type="button" value="Home" onclick="window.location='index.jsp'" ></td>
                </tr>
			</table>
		</form>
	</body>
</html>