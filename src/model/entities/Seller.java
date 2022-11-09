package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String Nome;
	private String email;
	private Date birthDate;
	private double BasSalary;
	
	private Department department;
	
	public Seller() {}

	public Seller(Integer id, String nome, String email, Date birthDate, double basSalary, Department department) {
		Id = id;
		Nome = nome;
		this.email = email;
		this.birthDate = birthDate;
		BasSalary = basSalary;
		this.department = department;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getBasSalary() {
		return BasSalary;
	}

	public void setBasSalary(double basSalary) {
		BasSalary = basSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "seller [Id=" + Id + ", Nome=" + Nome + ", email=" + email + ", birthDate=" + birthDate + ", BasSalary="
				+ BasSalary + "]";
	}
	
	
}
