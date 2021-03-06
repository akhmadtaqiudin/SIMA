<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/css/style.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/makeOver/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/makeOver/js/bootstrap.min.js" ></script>
	<title>SIMA</title>
</head>
<body>
	<s:div cssClass="container">
		<div class="sdi">
			<img alt="Loading" src="${pageContext.request.contextPath}/makeOver/images/logoSDI.png">
			<h3>Sistem Informasi Manajemen Aset</h3>
		</div>
		<div class="login-container">
            <div id="output"></div>
            <div class="form-box">
            	<div class="errors">
                	<s:fielderror name="invalid"/>
                </div>
                <s:form namespace="/authentication" action="auth" validate="true" method="post">
                    <s:textfield name="userName" required="true" placeholder="username" />
					<s:password name="password" required="true" placeholder="password" />
					<s:select list="#{'admin':'Administrator','owner':'Owner','user':'User'}" name="hakAkses" required="true" id="level"/>
					<s:submit cssClass="btn btn-info " value="Login"/>
                </s:form>
            </div>
        </div>  
	</s:div>
</body>
</html>