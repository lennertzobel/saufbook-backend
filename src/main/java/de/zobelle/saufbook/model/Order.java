package de.zobelle.saufbook.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "saufbook_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "price", nullable = false, precision = 19, scale = 2)
    private BigDecimal price;

    @Column(name = "order_timestamp", nullable = false)
    private Instant orderTimestamp;

    @Column(name = "payment_timestamp")
    private Instant paymentTimestamp;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Instant getPaymentTimestamp() {
        return paymentTimestamp;
    }

    public void setPaymentTimestamp(Instant paymentTimestamp) {
        this.paymentTimestamp = paymentTimestamp;
    }

    public Instant getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Instant orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}