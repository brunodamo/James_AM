<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
	
    <title>Hotel Boa Viagem</title>
	<%@ include file="imports.jsp"%>



		<c:if test="${erro == false}">
			<script>
				$(document).ready(function(){
					noty({
							layout: 'top',
							type: 'success',
							text: '${msg}',
							dismissQueue: true, 
							animation: {
							open: {height: 'toggle'},
							close: {height: 'toggle'},
							easing: 'swing',
							speed: 500 
								},
							timeout: 1000
							});
				});          
			</script>
		</c:if>
		<c:if test="${erro == true}">
			<script>
				$(document).ready(function(){
					noty({
							layout: 'top',
							type: 'warning',
							text: '${msg}',
							dismissQueue: true, 
							animation: {
							open: {height: 'toggle'},
							close: {height: 'toggle'},
							easing: 'swing',
							speed: 500 
								},
							timeout: 1000
							});
				});          
			</script>
		</c:if>
		<c:if test="${registrado}">
			<script>
				$(document).ready(function(){
					noty({
							layout: 'center',
							type: 'success',
							text: '${msg}',
							dismissQueue: true, 
							animation: {
							open: {height: 'toggle'},
							close: {height: 'toggle'},
							easing: 'swing',
							speed: 500 
								},
							timeout: 0
							});
				});          
			</script>
		</c:if>
		
	</head>

  <body>
  <c:if test="">
  
  </c:if>
  <!-- container section start -->
  <section id="container" class="">
      <!--header start-->
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
            </div>

            <!--logo start-->
            <a href="index.jsp" class="logo">Hotel <span class="lite">Boa Viagem</span></a>
            <!--logo end-->
            
            


         
      </header>      
      <!--header end-->
      
      <%@ include file="sidebar.jsp"%>