
package org.apache.shardingsphere.example.shadow.entity;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_address")
public class Address implements Serializable {
    
    private static final long serialVersionUID = 4743102234543827855L;
    
    @Id
    @Column(name = "address_id")
    private Long addressId;
    
    @Column(name = "address_name")
    private String addressName;
    
    public Long getAddressId() {
        return addressId;
    }
    
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
    
    public String getAddressName() {
        return addressName;
    }
    
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
    
    @Override
    public String toString() {
        return String.format("address_id: %s, address_name: %s", addressId, addressName);
    }
}
