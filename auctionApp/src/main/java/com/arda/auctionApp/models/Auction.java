package com.arda.auctionApp.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

public class Auction {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Auction_Id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "current_price")
    private float currentPrice;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @Column(name = "seller_id")
    private String sellerId;

    @Column(name = "bidder_id")
    private String bidder_id;


}
