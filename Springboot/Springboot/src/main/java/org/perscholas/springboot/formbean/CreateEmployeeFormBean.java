package org.perscholas.springboot.formbean;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class CreateEmployeeFormBean {
private Integer id;
    @NotEmpty(message = "First Name is required.")
    @Length(max = 45, message = "First Name must be less than 45 characters.")
    private String firstName;
    @NotEmpty(message = "Last Name is required.")
    @Length(max = 45, message = "Last Name must be less than 45 characters.")
    private String lastName;
    @NotEmpty(message = "departmentName is required.")
    @Length(max = 45, message = "departmentName must be less than 45 characters.")
    private String departmentName;

}
