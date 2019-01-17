<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
  <head lang="en">
    <title>Spring boot demo</title>
    <link href="/static/css/index.css" rel="stylesheet" />
  </head>

  <body>
    <h1 id="title">${title}</h1>

    <c:url value="http://www.roncoo.com" var="url"/>
    Spring URL: ${springUrl}

    <form method="POST" enctype="multipart/form-data" action="/file/upload">
      file: <input type="file" name="roncoFile" />
      <input type="submit" value="submit"/>
    </form>
    
    
    
  </body>
  
  <script type="text/javascript">
    console.log("hi")
  </script>
  
  
</html>






