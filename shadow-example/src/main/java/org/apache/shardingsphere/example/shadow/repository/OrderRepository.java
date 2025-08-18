package org.apache.shardingsphere.example.shadow.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.apache.shardingsphere.example.shadow.entity.Order;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class OrderRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void createTableIfNotExists() {
    }
    
    public void dropTable() {
    }
    
    public void truncateTable() {
    }
    
    public Long insert(final Order order) {
        entityManager.persist(order);
        return order.getOrderId();
    }
    
    public void delete(final Long orderId) {
        Query query = entityManager.createQuery("DELETE FROM Order o WHERE o.orderId = ?1");
        query.setParameter(1, orderId);
        query.executeUpdate();
    }
    
    public List<Order> selectAll() {
        return (List<Order>) entityManager.createQuery("SELECT o FROM Order o").getResultList();
    }
}
