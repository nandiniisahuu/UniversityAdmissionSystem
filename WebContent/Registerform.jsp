<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>University Admission System - Registration</title>
<link rel="stylesheet" href="default.css" type="text/css">
<script src="scripts/general.js"></script>
<script src="scripts/ts_picker.js"></script>
<script>
	function validate() {
		var form = document.register;

		if (!form.fname.value || !form.lname.value || !form.bdate.value
				|| !form.loginname.value || !form.password.value
				|| !form.sanswer.value
				|| (form.ch.checked && !form.ownquest.value)) {
			alert("All fields are mandatory.");
			return false;
		}

		if (!isNaN(form.loginname.value.charAt(0))) {
			alert("Login name must start with an alphabet.");
			return false;
		}

		if (/\d/.test(form.fname.value)) {
			alert("First name must contain only alphabets.");
			return false;
		}

		// Validate date format as YYYY-MM-DD
		var datePattern = /^\d{4}-\d{2}-\d{2}$/;
		if (!datePattern.test(form.bdate.value)) {
			alert("Birth date must be in format YYYY-MM-DD.");
			return false;
		}

		return true;
	}

	function check() {
		var form = document.register;
		form.ownquest.disabled = !form.ch.checked;
		form.squest.disabled = form.ch.checked;
	}
</script>
</head>
<body>
	<div id="header">
		<div id="logo">
			<h1><jsp:include page="header.html" /></h1>
		</div>
	</div>

	<div id="content">
		<div id="sidebar">
			<div id="archives" class="boxed">
				<h2>REGISTRATION FORM</h2>
				<div class="content">
					<form action="RegisterAction.jsp" method="post" name="register"
						onsubmit="return validate()">
						<p class="status-msg">
							<%
								if (request.getParameter("status") != null) {
							%>
							<%=request.getParameter("status")%>
							<%
								}
							%>
						</p>
						<table align="center">
							<tr>
								<td><strong>First Name</strong></td>
								<td><input type="text" name="fname"></td>
							</tr>
							<tr>
								<td><strong>Last Name</strong></td>
								<td><input type="text" name="lname"></td>
							</tr>
							<tr>
								<td><strong>Birth Date</strong></td>
								<td><input type="date" name="bdate"></td>
							</tr>
							<tr>
								<td><strong>City</strong></td>
								<td><select name="city">
										<option>Hyderabad</option>
										<option>Mumbai</option>
										<option>Delhi</option>
										<option>Kolkata</option>
								</select></td>
							</tr>
							<tr>
								<td><strong>State</strong></td>
								<td><select name="state">
										<option>Andhra Pradesh</option>
										<option>Maharashtra</option>
										<option>Delhi</option>
										<option>West Bengal</option>
								</select></td>
							</tr>
							<tr>
								<td><strong>Country</strong></td>
								<td><select name="country">
										<option>India</option>
								</select></td>
							</tr>
							<tr>
								<td><strong>Login Name</strong></td>
								<td><input type="text" name="loginname"></td>
							</tr>
							<tr>
								<td><strong>Password</strong></td>
								<td><input type="password" name="password"></td>
							</tr>
							<tr>
								<td><strong>Secret Question</strong></td>
								<td><select name="squest">
										<option value="1">What is your favorite pastime?</option>
										<option value="2">Who was your childhood hero?</option>
										<option value="3">What was the name of your first
											school?</option>
										<option value="4">Where did you meet your spouse?</option>
										<option value="5">What is your favorite sports team?</option>
										<option value="6">What is your father's middle name?</option>
										<option value="7">What was your high school mascot?</option>
										<option value="8">What make was your first car or
											bike?</option>
										<option value="9">What is your pet's name?</option>
								</select></td>
							</tr>
							<tr>
								<td colspan="2"><strong><input type="checkbox"
										name="ch" value="1" onclick="check()"> Own Question</strong></td>
							</tr>
							<tr>
								<td><strong>Own Question</strong></td>
								<td><input type="text" name="ownquest" disabled></td>
							</tr>
							<tr>
								<td><strong>Secret Answer</strong></td>
								<td><input type="text" name="sanswer"></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="submit"
									value="Register"> <br>
								<a href="index.jsp">Login</a></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div id="footer"></div>
</body>
</html>
