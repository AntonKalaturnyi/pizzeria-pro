package pzinsta.pizzeria.model.pizza;

import pzinsta.pizzeria.model.MonetaryAmountAttributeConverter;

import javax.money.MonetaryAmount;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

//++
@Entity
public class Crust implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
	private Long id;
    
    @Size(max = 100)
    @NotNull
	@Column(unique = true, name = "crustName")
	private String name;
	
    @NotNull
	@Convert(converter = MonetaryAmountAttributeConverter.class)
	private MonetaryAmount price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MonetaryAmount getPrice() {
		return price;
	}

	public void setPrice(MonetaryAmount cost) {
		this.price = cost;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Crust)) return false;
		Crust crust = (Crust) o;
		return Objects.equals(getName(), crust.getName()) &&
				Objects.equals(getPrice(), crust.getPrice());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getPrice());
	}
}
