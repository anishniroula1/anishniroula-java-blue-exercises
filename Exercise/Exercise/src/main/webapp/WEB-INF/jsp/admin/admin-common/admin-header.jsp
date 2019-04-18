<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
  <head>
    <meta charset="utf-8">
    <title>Welcome To Dashbard</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.6/css/all.css">
    <c:url value="/css/admin/admin-css.css" var="cssHref" />
	<link rel="stylesheet" href="${cssHref}">
    
  </head>
  
  <c:url var="adminPost" value="/admin/adminpost"/>
  <c:url var="allPost" value="/admin/allpost"/>
  
  
  <body>
    <div class="backend-root">
      <header>
        <div class="header-section">
          <div class="header-content">
            <div class="header-container logo">
              <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Logo_TV_2015.svg/1200px-Logo_TV_2015.svg.png" class="platform-logo">
            </div>
            <div class="header-container header-nav">
              <a href="#"><i class="fas fa-question-circle nav-icon"></i></a>
              <a href="#"><i class="fas fa-bell nav-icon"></i></a>
              <a href="#"><i class="fas fa-user-circle nav-icon"></i></a>
            </div>
          </div>
        </div>
      </header>
      <div class="body-root">
        <div class="body-section">
          <div class="body-content">
            <div class="sidebar">
              <div class="sidebar-content">
              <c:if test="${not empty loginuser}">
    				<h5>User: ${loginuser.userName}</h5>
    			</c:if>
                <div class="sidebar-container sidebar-menu">
                  <a href="${allPost}" class="menu-item"><i class="fas fa-home menu-icon"></i>Dashboard</a>
                  <a href="${adminPost}" class="menu-item"><i class="fas fa-bolt menu-icon"></i>Create</a>
                  <a href="#" class="menu-item"><i class="fas fa-folder menu-icon"></i>Content</a>
                  <a href="#" class="menu-item"><i class="fas fa-comments menu-icon"></i>Community</a>
                  <a href="#" class="menu-item"><i class="fas fa-trophy menu-icon"></i>Pro</a>
                  <a href="#" class="menu-item"><i class="fas fa-tag menu-icon"></i>Shop</a>
                  <a href="#" class="menu-item"><i class="fas fa-chart-area menu-icon"></i>Analytics</a>
                  <a href="#" class="menu-item"><i class="fas fa-cog menu-icon"></i>Settings</a>
                </div>
              </div>
            </div>
            <div class="main">
              <div class="main-content">
                
           