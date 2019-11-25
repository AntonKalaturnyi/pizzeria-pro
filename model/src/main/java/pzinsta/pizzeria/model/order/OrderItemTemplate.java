package pzinsta.pizzeria.model.order;

import pzinsta.pizzeria.model.Constants;

import javax.persistence.*;
import javax.validation.constraints.Size;

//++
@Entity
public class OrderItemTemplate {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    @OneToOne(optional = false)
    private OrderItem orderItem;

    @Size(max = 1000)
    private String description;

    @Size(max = 1000)
    private String imageFileName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
