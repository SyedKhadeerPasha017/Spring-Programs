<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body bgcolor="teal">
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

        <h2>My Account Number is : ${account.account_no}</h2>
        <h2>My Account Balance is : ${account.balance}</h2>
        <h2>My Transfer Amount is : ${account.tamount}</h2>
        <h2>Target Account is : ${account.tar_account}</h2>
        <h2>Target Account Balance is : ${account.prevBalance}</h2>
        <h2>After Transfer Target Account Balance is : ${account.currentBalance}</h2>
    </center>
</body>
