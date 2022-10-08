<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
        <form method = "POST" name = "add" >
        <h2> Welcome to my app </h2>
        <h2> Sing up  </h2>
        <table border=1 cellpadding = 3 cellspacing = 0>
            <tr>
              <th> login  </th>
              <td>  <textarea name="login"></textarea>   </td>
            </tr>

            <tr>
               <th> password  </th>
               <td>  <textarea name="password"></textarea>  </td>
            </tr>

            <tr>
              <th> fio  </th>
              <td>  <textarea name="fio"></textarea>  </td>
            </tr>

            <tr>
             <th> bithday  </th>
             <td>  <textarea name="birthday"></textarea>  </td>
            </tr>


            <div>
            <p> <input type="submit" </p>
            </div>

</form>
</body>
</html>


