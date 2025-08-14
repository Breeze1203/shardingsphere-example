package org.apache.shardingsphere.example.sharding.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.apache.shardingsphere.example.sharding.entity.OrderItem;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class OrderItemRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void createTableIfNotExists() {
    }
    
    public void dropTable() {
    }
    
    public void truncateTable() {
    }
    
    public Long insert(final OrderItem orderItem) {
        entityManager.persist(orderItem);
        return orderItem.getOrderItemId();
    }
    
    public void delete(final Long id) {
        Query query = entityManager.createQuery("DELETE FROM OrderItem i WHERE i.orderId = ?1");
        query.setParameter(1, id);
        query.executeUpdate();
    }
    
    public List<OrderItem> selectAll() {
        return (List<OrderItem>) entityManager.createQuery("SELECT o from OrderItem o").getResultList();
    }
}
