package com.eventmgmt.service;

import com.eventmgmt.model.EventTicket;
import com.eventmgmt.repository.EventTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTicketService {

    @Autowired
    private EventTicketRepository eventTicketRepository;

    public EventTicket saveEventTicket(EventTicket eventTicket) {
        return eventTicketRepository.save(eventTicket);
    }

    public Integer getTotalAmountBySeller(String sellerId) {
        return eventTicketRepository.getTotalAmountBySeller(sellerId);
    }

    public List<EventTicket> filterBySellerName(String sellerName) {
        return eventTicketRepository.filterBySellerName(sellerName);
    }

    public List<EventTicket> getAllWithPagination(int offset, int limit) {
        return eventTicketRepository.findAll().subList(offset,
                Math.min(offset + limit, eventTicketRepository.findAll().size()));
    }
}
