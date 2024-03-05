<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body bgcolor="skyblue">
    <center>
        <a href="/">Add Customer</a>
        <h1>Customer List</h1>
        <table border="1">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th>City</th>
                <th>State</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>  
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td>${customer.first_name}</td>
                    <td>${customer.last_name}</td>
                    <td>${customer.address}</td>
                    <td>${customer.city}</td>
                    <td>${customer.state}</td>
                    <td>${customer.email}</td>
                    <td>${customer.phone}</td>
                    <td>
                        <a href="/edit/${customer.first_name}">Edit</a>
                    </td>
                    <td>
                        <a href="/delete/${customer.first_name}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </center>
</body>