<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Add Hotel</h2>
    <form action="saveHotel" method="post">
        Name: <input type="text" name="name"/><br/>
        Address: <input type="text" name="address"/><br/>
        City: <input type="text" name="city"/><br/>
        <input type="submit" value="Save Hotel"/>
    </form>
</body>
</html>
