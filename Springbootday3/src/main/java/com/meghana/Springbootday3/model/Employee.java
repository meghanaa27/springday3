package com.meghana.Springbootday3.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
@Entity
@Table(name = "student")
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "Name")
	private String employeeName;
	@Column(name = "Age")
	private int employeeAge;
	@Column(name = "Salary")
	private long salary;
	public Employee() 
	{
		super();
	}
	public Employee(int id, String employeeName, int employeeAge, long salary) 
	{
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.salary = salary;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getEmployeeName() 
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() 
	{
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) 
	{
		this.employeeAge = employeeAge;
	}
	public long getSalary() 
	{
		return salary;
	}
    public void setSalary(long salary)
    {
    	this.salary = salary;
    }
}
