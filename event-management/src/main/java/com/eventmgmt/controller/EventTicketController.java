package com.eventmgmt.controller;

import com.eventmgmt.model.EventTicket;
import com.eventmgmt.service.EventTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event-tickets")
public class EventTicketController {

    @Autowired
    private EventTicketService eventTicketService;

    // POST API to add a new ticket
    @PostMapping
    public EventTicket addEventTicket(@RequestBody EventTicket eventTicket) {
        return eventTicketService.saveEventTicket(eventTicket);
    }

    // GET API to get total amount grouped by seller
    @GetMapping("/total/{sellerId}")
    public Integer getTotalAmountBySeller(@PathVariable String sellerId) {
        return eventTicketService.getTotalAmountBySeller(sellerId);
    }

    // GET API to filter by seller name (case-insensitive)
    @GetMapping("/filter")
    public List<EventTicket> filterBySellerName(@RequestParam String sellerName) {
        return eventTicketService.filterBySellerName(sellerName);
    }

    // GET API with pagination (offset and limit)
    @GetMapping("/pagination")
    public List<EventTicket> getAllWithPagination(@RequestParam int offset, @RequestParam int limit) {
        return eventTicketService.getAllWithPagination(offset, limit);
    }
}
