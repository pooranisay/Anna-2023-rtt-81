<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<section>
    <div class="container pt-5">

        <h1 class="pb-3">Customer Search</h1>

        <form action="/customer/search" method="GET">
            <label for="search" ><b>First Name:</b></label>
            <input type="text"  id="search" name="search" placeholder="Search by first name" value="${search}"/>
            <label for="searchLastName" ><b>Last Name:</b></label>
            <input type="text"  id="searchLastName" name="searchLastName" placeholder="Search by last name" value="${searchLastName}"/>
                <button type="submit" class="btn btn-primary">Search</button>

        </form>

        <c:if test="${not empty customerVar}">
            <section class="bg-light1 pb-5">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-12">

                            <h1 class="text-center pt-5">Customers Found ${customerVar.size()}</h1>

                            <table class="table table-hover pt-3">
                                <tr>
                                    <td>Id</td>
                                    <td>First Name</td>
                                    <td>Last Name</td>
                                    <td>Phone</td>
                                    <td>City</td>
                                    <td>Image</td>
                                    <td>Edit</td>
                                    <td>Details</td>
                                    <td>File Upload</td>
                                </tr>
                                <c:forEach items="${customerVar}" var="customer">
                                    <tr>
                                        <td>${customer.id}</td>
                                                                       <td>${customer.firstName}</td>
                                                                       <td>${customer.lastName}</td>
                                                                       <td>${customer.phone}</td>
                                                                       <td>${customer.city}</td>
                                                                       <td><img src="${customer.imageurl}" style="max-width:100px"></td>
                                                                       <td><a href="/customer/edit/${customer.id}">Edit</a></td>
                                                                       <td><a href="/customer/detail?id=${customer.id}">Detail</a></td>
                                                                       <td><a href="/customer/fileupload?id=${customer.id}">Upload</a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
        </c:if>

    </div>
</section>

<jsp:include page="../include/footer.jsp"/>
