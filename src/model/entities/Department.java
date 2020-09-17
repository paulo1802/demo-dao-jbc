package model.entities;

import java.io.Serializable;

public class Department implements Serializable {

	static final long serialVersionUID = 1L;
	private int Id;
	private String name;
	
	
	
	public Department() {
	}
	
	public Department(int id, String name) {
		Id = id;
		this.name = name;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (Id != other.Id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + "]";
	}
	
	


	

}
