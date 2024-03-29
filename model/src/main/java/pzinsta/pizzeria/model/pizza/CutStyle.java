package pzinsta.pizzeria.model.pizza;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

//++
@Entity
public class CutStyle  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
	private Long id;
    
    @NotNull
    @Size(max = 100)
    @Column(unique = true, name = "cutStyleName")
	private String name;

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

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof CutStyle)) return false;
		CutStyle cutStyle = (CutStyle) o;
		return Objects.equals(getName(), cutStyle.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}
}
