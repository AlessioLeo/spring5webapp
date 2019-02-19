package guru.springframework.spring5webapp.model;

import javax.persistence.*;

@Entity
public class Publisher {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;
		
	
	public Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Publisher other = (Publisher) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

    @Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
    
    

	
}
