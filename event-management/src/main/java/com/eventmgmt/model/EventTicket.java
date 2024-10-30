package com.eventmgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_ticket")
public class EventTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventTicketId;

    private String userId;
    private String sellerId;
    private int amount;

    // Constructors, Getters, and Setters

    public EventTicket() {
    }

    public EventTicket(String userId, String sellerId, int amount) {
        this.userId = userId;
        this.sellerId = sellerId;
        this.amount = amount;
    }

    public Long getEventTicketId() {
        return eventTicketId;
    }

    public void setEventTicketId(Long eventTicketId) {
        this.eventTicketId = eventTicketId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
