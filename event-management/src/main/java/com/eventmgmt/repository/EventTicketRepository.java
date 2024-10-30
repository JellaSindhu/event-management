package com.eventmgmt.repository;

import com.eventmgmt.model.EventTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventTicketRepository extends JpaRepository<EventTicket, Long> {

    @Query("SELECT SUM(e.amount) FROM EventTicket e WHERE e.sellerId = :sellerId")
    Integer getTotalAmountBySeller(@Param("sellerId") String sellerId);

    @Query("SELECT e FROM EventTicket e WHERE LOWER(e.sellerId) LIKE LOWER(CONCAT('%', :sellerName, '%'))")
    List<EventTicket> filterBySellerName(@Param("sellerName") String sellerName);
}
