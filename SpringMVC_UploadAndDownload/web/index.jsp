<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<a href="test.do">测试一下</a><br>

<a href="download.do?fileName=MySQL常用的函数.pdf">文件下载</a><br>

<form action="upload.do" method="post" enctype="multipart/form-data">
  text:<input type="text" name="text" value=""><br>
  upload:<input type="file" name="upload"><br>
  <input type="submit" value="upload">
</form>



</body>
</html>