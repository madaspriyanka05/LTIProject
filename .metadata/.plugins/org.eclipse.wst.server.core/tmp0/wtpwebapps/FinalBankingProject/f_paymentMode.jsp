<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>sRishTi Banking Services</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link href="f_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1><a href="index.html">sRish<span>Ti</span></a> 
        	<small>Simple banking services</small></h1>
      </div>
      <div class="menu_nav">
        <ul>
          <li><a href="index.html">My Accounts</a></li>
          <li><a href="">My Profile</a></li>
          <li class="active"><a href="PaymentMode.html">Payments/Transfers</a></li>
          <li><a href="">e-Services</a></li>
          <li><a href="">Enquiries</a></li>
        </ul>
        <div class="searchform">
          <form id="formsearch" name="formsearch" method="post" action="#">
            <span>
            <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" placeholder="Search our ste:" type="text" />
            </span>
            <input name="button_search" src="f_images/search_btn.gif" class="button_search" type="image" />
          </form>
        </div>
      </div>
    </div>
  </div>

  <div class="content">
    <div class="content_resize"> 
      <div class="mainbar">
        <div class="article">
          <br>
            <table id="funds" cellpadding="0" style="width:100%">
                <tr>
                    <th><h2>Funds Transfer:</h2></th>
                </tr> 
                <tr>
                    <td><h3><a href="f_AddNewBeneficiary.jsp">Add & Manage Beneficiary</a></h3></td>
                </tr>
                <tr><td>&nbsp;</td></tr>
                <tr>
                    <th><h2>Within sRishTi</h2></th>
                </tr>
                <tr>
                    <td><h3><a href="">Accounts of Others - Within sRishTi</a></h3></td>
                    <td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                    <td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                    <td><h3><a href="">Funds Transfer (Own sRishTi A/c)</a></h3></td>
                </tr>
                <tr><td>&nbsp;</td></tr>
                <tr>
                    <th><h2>Outside sRishTi</h2></th>
                </tr>
                <tr>
                    <td><h3><a href="">Other Bank Transfer</a></h3></td>
                    <td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                    <td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                    <td><h3><a href="IMPS.html">IMPS Funds Transfer</a></h3></td>
                </tr>
                <tr>
                    <td><h3><a href="NEFT.html">NEFT Funds Transfer</a></h3></td>
                    <td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                    <td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                    <td><h3><a href="RTGS.html">RTGS Funds Transfer</a></h3></td>
                </tr>
            </table>
        </div>
        
            <div class="article">
                <div class="clr"></div>
                <img src="images/img2.jpg" width="30" height="20" alt="" class="fl" />
                <p>
                    The Payments and Transfers tab enables you to make online Transactionsusig funds in your Accounts.
                    You can transfer funds to any Accounts.
                </p>
            </div>
      </div>
      
      <div class="sidebar">
          <div class="gadget">
            <h2><span>Quick Links</span></h2>
            <div class="clr"></div>
            <ul class="sb_menu">
              <li class="quick-link"><a href="#">Account Details</a></li>
              <li class="quick-link"><a href="#">Fund Transfer</a></li>
              <li class="quick-link"><a href="#">Other Payments</a></li>
              <li class="quick-link"><a href="#">Last 10 Transactions</a></li>
              <li class="quick-link"><a href="#">Login</a></li>
            </ul>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>

  <div class="footer">
      <div class="footer_resize">
          <p class="lf">Net Banking.</p>
          <p class="rf">Design by Priyanka, Jyoti, Pooja and Divyanshu</p>
          <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>