<jsp:include page="../include/header.jsp"/>

<h1>Create Employee</h1>


<section>
    <div class="container">
        <!-- the action attribute on the form tag is the URL that the form will submit to when then user clicks the submit button -->
        <form method="get" action="/employee/createSubmit">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" aria-describedby="firstNameHelp">
                <div id="firstNameHelp" class="form-text">Please let us know your first name</div>
            </div>
            <div class="mb-3">
                <label for="lastName" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName">
            </div>
            <div class="mb-3">
                           <label for="departmentName" class="form-label">Department Name</label>
                           <input type="text" class="form-control" id="departmentName" name="departmentName">
                       </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>
```



















