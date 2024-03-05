<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body bgcolor="olive">
    <center>
        <h1 style="color:black">INDIAN BANK</h1>
        <a href="/">Home</a>&nbsp;&nbsp;&nbsp;
        <a href="/addAccount">New Account</a> &nbsp;&nbsp;&nbsp;
        <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;
        <a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;
        <a href="/withdraw">withdraw</a>&nbsp;&nbsp;&nbsp;
        <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;
        <a href="/close">Close A/C</a>&nbsp;&nbsp;&nbsp;
        <a href="">About Us</a> <br><br><br>

        <h2>Welcome ${details.name}</h2>
        <table border="1">
            <tr>
                <th>ACCOUNT NO</th>
                <th>USERNAME</th>
                <th>AMOUNT</th>
                <th>ADDRESS</th>
                <th>PHONE</th>
            </tr>
            <tr>
                <td>${details.account_no}</td>
                <td>${details.name}</td>
                <td>${details.amount}</td>
                <td>${details.address}</td>
                <td>${details.mobile_no}</td>
            </tr>
        </table>
    </center>
</body>