<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
The form tag renders an HTML 'form' tag and exposes a binding path to inner tags for data binding.
You can use any prefix name instead of 'form', e.g. 'sf'. Then you use 'sf' as the namespace in the jsp.
    e.g. <sf:form method="POST" action="./addStudent">
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<p>This is a Spring MVC Form Handling demo. The Spring JSP form tag library is used in the student.jsp.
    It support a data binding between the form and the student object. It's a very useful mechanism that saves you
    from having to parse each form field individually.
    Also demonstrates the ModelAndView class usage and the @ModelAttribute annotation usage in the StudentController.
</p>
<h2>Student Information</h2>
<form:form method="POST" action="./addStudent">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td><form:label path="id">id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>

</html>