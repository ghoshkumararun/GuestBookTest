    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
    <!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<form>
<div class="container">
  <p class="bg-primary" align="center">Data List - You have logged in as Admin</p>
  
<!--   <a href="allData" class="btn btn-info"> See Already Rejected Approved Data</a> -->
  
  <div class="table-responsive">          
  <table class="table">
	<thead>
	<tr><th>#</th><th>Text</th><th>Imagepath</th><th>Approve</th><th>Reject</th></tr></thead>
	<tbody>
    <c:forEach var="ent" items="${list}"> 
    <tr>
    <td>${ent.id}</td>
    <td>${ent.textentry}</td>
    <td>${ent.imagepath}</td>
    <td><a href="approve/${ent.id}" class="btn btn-success" onClick= "approve()">Approve</a></td>
    <td><a href="reject/${ent.id}" class="btn btn-danger" onClick= "reject()">Reject</a></td>
    </tr>
    </c:forEach>
    </tbody>
    </table>
    
     <p class="bg-primary" align="center">Data List - Already Approved / rejected data</p>
     <table class="table">
	<thead>
	<tr><th>#</th><th>Text</th><th>Imagepath</th><th>Approve / Reject</th></tr></thead>
	<tbody>
    <c:forEach var="arlist" items="${approvedrejectedlist}"> 
    <tr>
    <td>${arlist.id}</td>
    <td>${arlist.textentry}</td>
    <td>${arlist.imagepath}</td>
    <td>${arlist.status}</td>
    
    </tr>
    </c:forEach>
    </tbody>
    </table>
    
    </div>
    </div></form>
    
    <script>
function reject() {
 alert("Rejected");  
}

function approve() {
	 alert("Approved");  
	}
</script>
    
    
    </body>
    </html>
    