<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome To The Page</title>
</head>
<body>
	<c:url var="signup" value="/signup" />
	<c:url var="homepage" value="/" />
	<c:url var="userLogin" value="/login" />
	<c:url var="forgotpassword" value="/forgotpassword" />
<c:if test="${not empty loginuser}">
    	<h2>User: ${loginuser.userName}</h2>
    </c:if>
	<div class="container" id="container">
	
	
	<div class="form-container sign-up-container">

			<form:form action="${signup}" method="POST" modelAttribute="userSignUp">
				<h1>Create Account</h1>
				<form:input path="name" placeholder="Full Name"/>
				<form:errors path="name" cssClass="error" />

				<form:input path="email" placeholder="Email"/>
				<form:errors path="email" cssClass="error" />

				<form:input path="userName" placeholder="Username"/>
				<form:errors path="userName" cssClass="error" />

				<form:password path="password" placeholder="Password"/>
				<form:errors path="password" cssClass="error" />
				<form:errors path="passwordMatching" cssClass="error" />

				<form:password path="verifyPassword" placeholder="Confirm Password"/>
				<form:errors path="verifyPassword" cssClass="error" />

				<form:input path="location" placeholder="Location: State"/>
				<form:errors path="location" cssClass="error" />

				<form:input path="gender" placeholder="Gender"/>
				<form:errors path="gender" cssClass="error" />

				<input class="submitButton" type="submit" value="Sign Up">
			</form:form>
		</div>
			<div class="form-container sign-in-container">
			<form action="${userLogin}" method="POST">
				<h1>Sign in</h1>
				<input type="text" name="userName" placeholder="Login" /> 
				<input type="password" name="password" placeholder="Password" /> 
					<input class="submitButton" type="submit" value="Login" />
					<h2 class="error">${error}</h2>
					<a href="${forgotpassword}">Forgot your password?</a> 
			</form>
		</div>
		<div class="overlay-container">
			<div class="overlay">
				<div class="overlay-panel overlay-left">
					<h1>Hello, Friend!</h1>
					<p>Enter your personal details and start journey with us</p>
					<button class="ghost" id="signIn">Sign In</button>
				</div>
				<div class="overlay-panel overlay-right">
					<h1>Welcome to the Homepage!</h1>
					<p>To keep connected with us please login with your personal
						info</p>
					<button class="ghost" id="signUp">Sign Up</button>
				</div>
			</div>
		</div>
	</div>

</body>



<style>
@import
	url("https://fonts.googleapis.com/css?family=Montserrat:400,400i,700");

body {
	font-family: Montserrat, sans-serif;
	display: flex;
	justif-content: center;
	align-items: center;
	height: 100%;
	width: 100%;
}

h1 {
	font-weight: bold;
	margin: 0;
}

p {
	font-size: 14px;
	font-weight: 100;
	line-height: 20px;
	letter-spacing: 0.5px;
	margin: 20px 0 30px;
}

span {
	font-size: 12px;
}

a {
	color: #333;
	font-size: 14px;
	text-decoration: none;
	margin: 15px 0;
}

button {
	border-radius: 20px;
	border: 1px solid #ff4b2b;
	background-color: #ff4b2b;
	color: #ffffff;
	font-size: 12px;
	font-weight: bold;
	padding: 12px 45px;
	letter-spacing: 1px;
	text-transform: uppercase;
	transition: transform 80ms ease-in;
}

button:active {
	transform: scale(0.95);
}

button:focus {
	outline: none;
}

button.ghost {
	background-color: transparent;
	border-color: #ffffff;
}

form {
	background-color: #ffffff;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 50px;
	height: 100%;
	text-align: center;
}

input {
	background-color: #eee;
	border: none;
	padding: 12px 15px;
	margin: 8px 0;
	width: 100%;
}

.social-container {
	margin: 20px 0;
}

.social-container a {
	border: 1px solid #dddddd;
	border-radius: 50%;
	display: inline-flex;
	justify-content: center;
	align-items: center;
	margin: 0 5px;
	height: 40px;
	width: 40px;
}

.container {
	background-color: #ffffff;
	border-radius: 10px;
	box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px
		rgba(0, 0, 0, 0.22);
	position: relative;
	overflow: hidden;
	width: 1020px;
	max-width: 100%;
	min-height: 100%;
	margin-right: auto;
    margin-left: auto;
}

.form-container {
	position: absolute;
	top: 0;
	height: 100%;
	transition: all 0.6s ease-in-out;
}

.sign-in-container {
	left: 0;
	width: 50%;
	z-index: 2;
}
.submitButton{
    background: #2fcc6a99;
    border-radius: 100px;
    font-weight: bold;
    text-decoration: underline;
}

.sign-up-container {
	left: 0;
	width: 50%;
	opacity: 0;
	z-index: 1;
}

.container.right-panel-active .sign-in-container {
	transform: translateX(100%);
}

.container.right-panel-active .sign-up-container {
	transform: translateX(100%);
	opacity: 1;
	z-index: 5;
	animation: show 0.6s;
}

@
keyframes show { 0%, 49.99% {
	opacity: 0;
	z-index: 1;
}

50%,
100%
{
opacity
:
 
1;
z-index
:
 
5;
}
}
.overlay-container {
	position: absolute;
	top: 0;
	left: 50%;
	width: 50%;
	height: 100%;
	overflow: hidden;
	transition: transform 0.6s ease-in-out;
	z-index: 100;
}

.container.right-panel-active .overlay-container {
	transform: translateX(-100%);
}

.overlay {
	background: #4609e8;
    background: -webkit-linear-gradient(to right, #ff4b2b, #ff416c);
    background: linear-gradient(to right, #0068f9c4, #41ffa3d4);
    background-repeat: no-repeat;
    background-size: cover;
    background-position: 0 0;
    color: #ffffff;
    position: relative;
    left: -100%;
    height: 100%;
    width: 200%;
    transform: translateX(0);
    transition: transform 0.6s ease-in-out;
}

.container.right-panel-active .overlay {
	transform: translateX(50%);
}

.overlay-panel {
	position: absolute;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 40px;
	text-align: center;
	top: 0;
	height: 100%;
	width: 40%;
	transform: translateX(0);
	transition: transform 0.6s ease-in-out;
}

.overlay-left {
	transform: translateX(-20%);
}

.container.right-panel-active .overlay-left {
	transform: translateX(0);
}

.overlay-right {
	right: 0;
	transform: translateX(0);
}

.container.right-panel-active .overlay-right {
	transform: translateX(20%);
}
</style>

<script>
const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});
</script>
</html>