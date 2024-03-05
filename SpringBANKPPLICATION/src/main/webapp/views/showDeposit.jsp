<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body bgcolor="navy">
    <center>
        <h1 style="color:black">HDFC BANK</h1>
        <a href="/">Home</a>&nbsp;&nbsp;&nbsp;
        <a href="/addAccount">New Account</a> &nbsp;&nbsp;&nbsp;
        <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;
        <a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;
        <a href="/withdraw">withdraw</a>&nbsp;&nbsp;&nbsp;
        <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;
        <a href="/close">Close A/C</a>&nbsp;&nbsp;&nbsp;
        <a href="">About Us</a> <br><br><br>

        <h2>Before deposit My Account Balance is : ${deposit.prevBalance}</h2>
        <h2>My deposit Amount is : ${deposit.amount}</h2>
        <h2>After deposit My Account balance is : ${deposit.currentBalance}</h2>
    </center>
</body>
