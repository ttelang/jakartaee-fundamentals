<%-- Greetings.jsp --%> 
<html>
	<body>
		<%! String str = " Hello World! "; %>
		<p>Today’s date: <%= (new java.util.Date()).toLocaleString() %>
		<p><% out.println(str); %>
		<br/>
	</body>
</html>
