 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title></title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body> 
       
    
       
  <div class="container">
  <form method="post" action="save">
  
  
  <p class="bg-primary" align="center">Add Data</p>
  
  <div class="form-group">
    <label for="textentry">Enter Text:</label>
    <input type="text" class="form-control" name ="textentry" id="textentry" required>
  </div>
  <div class="form-group">
    <label for="imagepath">Select Image :</label>
    <input type="text" class="form-control" name="imagepath" id="imagepath" value='NA'>
  </div>
  
  
  <button type="submit" class="btn btn-success">Submit</button>
</form>

</div>
</body>
</html>

