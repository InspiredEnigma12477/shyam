package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "Emps")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee extends BaseEntity{

	@Column(length = 20)
    private String firstName;
    @Column(length = 20)
    private String lastName;
    @Column(length = 30)
    private String email;
    @Column(length = 20)
    private String password;
    @Column(length = 20)
    private String workLocation;
    private LocalDate joinDate;
    private Double salary;
    
    public Employee(String firstName, String lastName, String email, String password, String workLocation,
			LocalDate joinDate, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.workLocation = workLocation;
		this.joinDate = joinDate;
		this.salary = salary;
	}
}
