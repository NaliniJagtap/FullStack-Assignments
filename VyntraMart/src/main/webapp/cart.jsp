<!DOCTYPE html>
<%@ page import="java.util.*"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/styles.css">
    </head>
    <body>
        <header>
            <table width="100%">
                <tr>
                    <td width="75%">
                        <h1><a href="index.jsp">My Cart</a></h1>
                    </td>
                    <td width="25%">
                        <a href="cart.jsp"><img src="img/cart.jpg" alt="cart" width="80" height="80"/></a>
                    </td>
                </tr>
            </table>
        </header>
        <section>
            <table width="100%">
                <tr height="40px">
                    <td width="40%">
                        <ul>
                            <li><a href="#" class="stylish">Selected Items</a></li>
                            <li><a href="#" class="stylish">Amount</a></li>
                            <li><a href="#" class="stylish">Total</a></li>
                        </ul>
                    </td>
                    <td width="30%">
                      
                        <a href="signin.jsp" class="normal">Calculate</a>
                        
                        <a href="#" class="normal">Payment</a>
                       </td>
                </tr>
            </table>
        </section>
        <nav>
            <ul>
                <form action="catalog.jsp">
                    <li><input type="submit" name="product" value="Saree Code 11"></li>
                    <li><input type="submit" name="product" value="Dress Code 01"></li>
                </form>
            </ul>
        </nav>

        <aside>
            <h1 align="center">Deals</h1>
            <form action="cart.jsp">
            
                    <p>Buy: <input type="submit" name="product" value="--"></p>
            
            </form>
        </aside>
    </body>