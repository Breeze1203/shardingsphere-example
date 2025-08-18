package org.apache.shardingsphere.example.shadow.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "t_order")
public class Order implements Serializable {
    
    private static final long serialVersionUID = 8306802022239174861L;
    
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @Column(name = "order_type")
    private int orderType;
    
    @Column(name = "user_id")
    private int userId;
    
    @Column(name = "address_id")
    private long addressId;
    
    @Column(name = "status")
    private String status;
    
    public long getOrderId() {
        return orderId;
    }
    
    public void setOrderId(final long orderId) {
        this.orderId = orderId;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(final int orderType) {
        this.orderType = orderType;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(final int userId) {
        this.userId = userId;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    public long getAddressId() {
        return addressId;
    }
    
    public void setAddressId(final long addressId) {
        this.addressId = addressId;
    }
    
    @Override
    public String toString() {
        return String.format("order_id: %s, order_type: %s, user_id: %s, address_id: %s, status: %s", orderId, orderType, userId, addressId, status);
    }
}
