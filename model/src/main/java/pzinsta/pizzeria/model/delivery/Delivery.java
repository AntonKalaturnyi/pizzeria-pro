package pzinsta.pizzeria.model.delivery;

import pzinsta.pizzeria.model.Constants;
import pzinsta.pizzeria.model.order.Order;
import pzinsta.pizzeria.model.user.DeliveryAddress;

import javax.persistence.*;
import java.io.Serializable;

//++
@Entity
public class Delivery implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    private DeliveryAddress deliveryAddress;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Deliveryperson deliveryperson;

    @JoinColumn(name = "deliveryOrder")
    @OneToOne(fetch = FetchType.LAZY)
    private Order order;

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public Deliveryperson getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Deliveryperson deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
