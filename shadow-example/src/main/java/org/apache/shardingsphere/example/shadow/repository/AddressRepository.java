

package org.apache.shardingsphere.example.shadow.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.apache.shardingsphere.example.shadow.entity.Address;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class AddressRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void createTableIfNotExists() {
    }
    
    public void dropTable() {
    }
    
    public void truncateTable() {
    }
    
    public Long insert(final Address entity) {
        entityManager.persist(entity);
        return entity.getAddressId();
    }
    
    public void delete(final Long addressCode) {
        Query query = entityManager.createQuery("DELETE FROM Address i WHERE i.addressId = ?1");
        query.setParameter(1, addressCode);
        query.executeUpdate();
    }
    
    @SuppressWarnings("unchecked")
    public List<Address> selectAll() {
        return (List<Address>) entityManager.createQuery("SELECT i FROM Address i").getResultList();
    }
}
