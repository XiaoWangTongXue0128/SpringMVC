
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script type="text/javascript">
        window.onload = function () {
            var button = document.getElementById("button");
            button.onclick = function () {
                //1.创建一个AJAX对象
                var xhr = new XMLHttpRequest();
                //2.打开一个通道 模拟一个请求  ("请求方式","请求URL",是否为异步true)
                xhr.open("post", "ajax.do", true);
              //  2.1如果想要发送的是json形式 告知浏览器解析的时候规则
                xhr.setRequestHeader("Content-type","application/json;charset=UTF-8")
                //3.发送后 时刻监听者服务端的状态   回调机制
                xhr.onreadystatechange = function () {
                    if (xhr.readyState == 4 && xhr.status == 200) {
                        //接收响应信息
                        alert(xhr.responseText);
                        //接收以后 需要处理 展示在浏览器中的某个组件里
                    }
                };
                xhr.send('{"name":"王天赐","age":"18"}')
            };
        };
    </script>
  </head>
  <body>
  <input type="button" id="button" name="name" value="ajax测试">
<%--      <a href="person1.do?person=1">String参数</a>--%>
<%--      <form method="post" action="person2.do">--%>
<%--            name:<input name="name" type="text" value=""><br>--%>
<%--            sex:<input name="sex" type="text" value=""><br>--%>
<%--            age:<input name="age" type="text" value=""><br>--%>
<%--            girlFirendName<input name="girlFirend.name" type="text" value=""><br>--%>
<%--            girlFirendAge<input name="girlFirend.age" type="text" value=""><br>--%>
<%--          <input type="submit" value="submit1">--%>
<%--      </form>--%>
<%--      <form method="post" action="person3.do">--%>
<%--          name:<input name="name" type="text" value=""><br>--%>
<%--          sex:<input name="sex" type="text" value=""><br>--%>
<%--          age:<input name="age" type="text" value=""><br>--%>
<%--          girlFirend1Name<input name="girlFirends[0].name" type="text" value=""><br>--%>
<%--          girlFirend1Age<input name="girlFirends[0].age" type="text" value=""><br>--%>
<%--          girlFirend2Name<input name="girlFirends[1].name" type="text" value=""><br>--%>
<%--          girlFirend2Age<input name="girlFirends[1].age" type="text" value=""><br>--%>
<%--          <input type="submit" value="submit2">--%>
<%--      </form>--%>
<%--      <form method="post" action="person4.do">--%>
<%--          name:<input name="name" type="text" value=""><br>--%>
<%--          sex:<input name="sex" type="text" value=""><br>--%>
<%--          age:<input name="age" type="text" value=""><br>--%>
<%--          <input type="submit" value="submit4">--%>
<%--      </form>--%>
<%--      <form method="post" action="person5.do">--%>
<%--          name:<input name="name" type="text" value=""><br>--%>
<%--          age:<input name="age" type="text" value=""><br>--%>
<%--          date:<input name="date" type="text" value=""><br>--%>
<%--          <input type="submit" value="submit5">--%>
<%--      </form>--%>

<%--      <form method="get" action="person5.do">--%>
<%--          name:<input name="name" type="text" value=""><br>--%>
<%--          age:<input name="age" type="text" value=""><br>--%>
<%--          date:<input name="date" type="text" value=""><br>--%>
<%--          <input type="submit" value="submit5">--%>
<%--      </form>--%>
  </body>
</html>
