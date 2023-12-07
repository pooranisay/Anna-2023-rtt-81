<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<section>
    <div class="container pt-5">
        <h1 class="pb-3">Employee Search</h1>
<%-- // add a label to the existing form input for first name --%>
<%-- // add a label to the existing form input for Last name --%>
        <form action="/employee/search">
            <label for="firstName"><b>First Name:</b></label>
            <input type="text" name="search" placeholder="Search by first name" value="${search}"/>

            <label for="lastName"><b>Last Name:</b></label>
            <input type="text" name="searchLastName" placeholder="Search by last name" value="${searchLastName}"/>
<button type="submit" class="btn btn-primary">Search</button>
</form>
        <c:if test="${not empty employeeVar}">
            <h1 class="pt-5">Employee Found ${employeeVar.size()}</h1>

            <table class="table table-hover">
                <tr>
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>departmentName</td>
                    <td>Edit</td>
                </tr>
                <c:forEach items="${employeeVar}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.departmentName}</td>

                        <td><a href="/employee/edit/${employee.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>

        </c:if>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>