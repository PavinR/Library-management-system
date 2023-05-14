<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LibraryManagement</title>
<style type="text/css">
table {
	
}

form {
	background-image:
		url(https://img.freepik.com/free-vector/library-with-books-shelves-desk-study_107791-1749.jpg?w=2000);
	margin-left: 270px;
	width: 50em
}

td {
	padding: 10px;
}

#table {
	color: white;
	margin: 30px 0px 0px 230px;
	/*border:2px solid gray;*/
}

.btn {
	padding-left: 10.5em;
	padding-bottom: 1em;
}

td h2 {
	text-aling: center;
}
</style>
</head>
<body>

	<form action="Register" method="post">
		<table id="table">
			<tr>
				<td><h2>Library management</h2></td>
			</tr>
			<tr>
				<td>Book Name:</td>
				<td><input type="text" name="bname"></td>
			</tr>
			<tr>
				<td>Auther Name:</td>
				<td><input type="text" name="auther"></td>
			</tr>
			<tr>
				<td>Book department:</td>
				<td><input type="text" name="bdep"></td>
			</tr>
			<tr>
				<td>Publisher Name:</td>
				<td><input type="text" name="publisher"></td>
			</tr>
			<tr>
				<td>Volume No:</td>
				<td><input type="text" name="volume"></td>
			</tr>
			<tr>
				<td>Book Price:</td>
				<td><input type="text" name="bprice"></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><input type="text" name="studname"></td>
			</tr>
			<tr>
				<td>IDcard No:</td>
				<td><input type="text" name="idcard"></td>
			</tr>
			<tr>
				<td>Due's pending:</td>
				<td><input type="text" name="dueamt"></td>
			</tr>
			<tr>
				<td>Fine Amount:</td>
				<td><input type="text" name="fineamt"></td>
			</tr>
			<tr>
				<td>Total no of books issued so far :</td>
				<td><input type="text" name="booksissued"></td>
			</tr>
			<tr>
				<td>No of books returned:</td>
				<td><input type="text" name="booksreturned"></td>
			</tr>
			<td class="btn"><input type="submit" value="register"></td>
		</table>
	</form>
</body>
</html>