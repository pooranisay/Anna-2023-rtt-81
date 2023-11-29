<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<section>
    <div class="container pt-5">
        <h1 class="pb-3">Customer Search</h1>
<%-- // add a label to the existing form input for first name --%>
<%-- // add a label to the existing form input for Last name --%>
        <form action="/customer/search">
            <label for="firstName">First Name:</label>
            <input type="text" name="search" placeholder="Search by first name" value="${search}"/>

            <label for="lastName">Last Name:</label>
            <input type="text" name="searchLastName" placeholder="Search by last name" value="${searchLastName}"/>
<button type="submit" class="btn btn-primary">Search</button>
</form>
        <c:if test="${not empty customerVar}">
            <h1 class="pt-5">Customers Found ${customerVar.size()}</h1>

            <table class="table table-hover">
                <tr>
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Phone</td>
                    <td>City</td>
                </tr>
                <c:forEach items="${customerVar}" var="customer">
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.city}</td>
                    </tr>
                </c:forEach>
            </table>

        </c:if>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>