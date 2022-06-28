/**
 * 
 */
package com.souvik.streams;

import java.util.Objects;

/**
 * @author Souvik_Das
 *
 */
public class Employee {

	private Integer emp_id;

	private String emp_name;

	private String emp_dept;

	public Employee(Integer emp_id, String emp_name, String emp_dept) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dept = emp_dept;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_dept=" + emp_dept + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emp_dept, emp_id, emp_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(emp_dept, other.emp_dept) && Objects.equals(emp_id, other.emp_id)
				&& Objects.equals(emp_name, other.emp_name);
	}




	
}
