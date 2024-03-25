<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>

  </head>
  <body>
  <a href="testIntercept.do">拦截器</a><br>
  <a href="test.do">test</a><br>
  <a href="testException.do">异常测试</a>
  <form method="post" action="login.do">
    ${requestScope.value}
    id:<input name="id" type="text" value=""/><br>
    name:<input name="name" type="text" value=""/><br>
    <input type="submit" value="submit">

  </form>
  </body>
</html>
