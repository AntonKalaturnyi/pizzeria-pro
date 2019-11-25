package pzinsta.pizzeria.model.order;

import org.hibernate.annotations.CreationTimestamp;
import pzinsta.pizzeria.model.Constants;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;

//++
@Entity
public class OrderEvent implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    @NotNull
    @CreationTimestamp
    private Instant occurredOn;

    @NotNull
    @Enumerated(EnumType.STRING)
    private OrderEventType orderEventType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getOccurredOn() {
        return occurredOn;
    }

    public void setOccurredOn(Instant occurredOn) {
        this.occurredOn = occurredOn;
    }

    public OrderEventType getOrderEventType() {
        return orderEventType;
    }

    public void setOrderEventType(OrderEventType orderEventType) {
        this.orderEventType = orderEventType;
    }
}
