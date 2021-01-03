<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("User_id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "faceofindia";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>Register Users For Events</h1>
<table border="5" width="80%">

<tr bgcolor="yellow">
<td>Sr.No</td>
<td>First_Name</td>
<td>Last_Name</td>
<td>Mobile_number</td>
<td>Email</td>
<td>Address</td>
</tr>
</>
<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/faceofindia", "root", "");
statement=connection.createStatement();
String sql ="select * from user";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<tr bgcolor="pink">
<td><%=resultSet.getString("User_id") %></td>
<td><%=resultSet.getString("First_name") %></td>
<td><%=resultSet.getString("Last_name") %></td>
<td><%=resultSet.getString("Mobile_number") %></td>
<td><%=resultSet.getString("Email") %></td>
<td><%=resultSet.getString("Address") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>