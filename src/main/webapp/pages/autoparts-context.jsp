<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h2>Student Result View Set</h2>


	<f:form id="SignUp" modelAttribute="info" action="autozone"
		method="POST">
		<table align="center">

			<tr>
				<td><f:label path="name">Name: </f:label></td>
				<td><f:input path="name" name="name" id="name" /></td>
			</tr>

			<tr>
				<td><f:label path="address">Address: </f:label></td>
				<td><f:input path="address" name="address" id="address" /></td>
			</tr>
			<tr>
				<td><f:label path="phoneno">PhoneNo:</f:label></td>
				<td><f:input path="phoneno" name="phoneno" id="phoneno" /></td>
			</tr>
			<tr>
				<td><f:label path="appointmentno">AppointmentNo:</f:label></td>
				<td><f:input path="appointmentno" name="appointmentno"
						id="appointmentno" /></td>
			</tr>
			<tr>
				<td><f:label path="emailaddress">Email:</f:label></td>
				<td><f:input path="emailaddress" name="emailaddress"
						id="emailaddress" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><f:button id="view Customer"
						name="view Customer">Sign Up</f:button></td>
			</tr>
			<tr></tr>
		</table>
	</f:form>
</body>
</html>