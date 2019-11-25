package pzinsta.pizzeria.model.order;

import pzinsta.pizzeria.model.Constants;
import pzinsta.pizzeria.model.pizza.Pizza;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

//++
@Entity
public class OrderItem implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	private Long id;

	@JoinColumn(name = "orderItemOrder")
    @ManyToOne
    private Order order;

    @JoinColumn(unique = true)
    @OneToOne(cascade = CascadeType.ALL)
	private Pizza pizza;

    @NotNull
    @Min(1)
	private int quantity;

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setId(Long id) {
        this.id = id;
    }

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof OrderItem)) return false;
		OrderItem orderItem = (OrderItem) o;
		return getQuantity() == orderItem.getQuantity() &&
				Objects.equals(getPizza(), orderItem.getPizza());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getOrder(), getPizza(), getQuantity());
	}
}
