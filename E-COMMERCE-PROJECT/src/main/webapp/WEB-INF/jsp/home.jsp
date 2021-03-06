<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html Xmlns:th="http:www.thymeleaf.org">

<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="/css/custom.css"/>
<link rel="stylesheet"  type="text/css"href="webjars/bootstap/3.3.7/css/bootstrap.min.css"/>
<spring:url value="/css/main.css"var=springCss"/>
<link href=${springCss}"rel="stylesheet"/>
<c:url  value="/css/main.css" var="jstlCss"/>
<link href=${jstlCss}"rel="stylesheet"/>
<c:url value="/img/please.jpg"var="please"/>
<title>Welcome</title>
 <head>
 <style>
  body{
     background-color:lightgray
  }
 h1{
 	text-align: center;
	box-shadow: 23px 23px 150px #003399;
     color :#ED1C16
     ;
    font-size: 60px;
    font-family: 
    border-color:black;
    box-shadow: 5px 5px 20px rgba(0, 0, 0, 0.5) ;
     border-radius:5px;
     margin-top:84px;
 }
 li{
  display:inline; 
  border-spacing:26px;
 text-align: center;
 padding-right:55px;
border-collapse:collapse;
overflow: hidden;
text-decoration: none;
 font-family: bold;  
 color:black;
 }

  h2{
  text-decoration: none;
  	font-family: Segoe Script;
  }
  
 img{
 
     box-shadow: 5px 5px 20px rgba(0, 0, 0, 0.5) ;
 }

  


 </style>




</head>
<body> 
    
<li ><a class="home"href="#home">Home</a></li>
  <li><a class="news" href="#news">News</a></li>
  <li><a class="contact" href="#contact">Contact</a></li>
  <li><a class="about" href="#about">About</a></li>
      <li><a class="login" href="/login">login</a></li>    
       <h1 align="center"style="colo:blue">Welcome to Runner sporty shose</h1>  


<a href="/men"><h2 align="center">MEM</h2></a> 
<img src="/images/download.jpg" width="450px" height="450px"     />
  <img src="/images/q.jpg" width="450px" height="450px"     /> 
   <img src="/images/lk.jpg" width="450px" height="450px"  />

<a href="/women"><h2 align="center">WOMEN</h2></a>
<img src="/images/h2.jpg" width="450px" height="450px"   /> 
<img src="/images/run.jpg" width="450px" height="450px"   /> 
<img src="/images/OIP.jpg" width="450px" height="450px"   /> 



</body>
</head>

</html>