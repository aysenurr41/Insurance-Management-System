package com.anadolubankproject.insurancemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "policy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //toplam kazanç
    @Column(name = "total_earnings")
    private int totalEarnings;

    //kar kazanç
    @Column(name = "profit_earning")
    private int profitEarning;

    //başlangıç tarihi
    @Column(name = "starting_date")
    private int startingDate;

    //bitiş tarihi
    @Column(name = "end_date")
    private int endDate;

    //Agent
    @ManyToOne // bir acentenin birden fazla poliçesi olabilir. Many -> Policy One -> Agent
    @JoinColumn(name = "agent_id")
    private  Agent agent;

    //customer
    @ManyToOne // bir customerin birden fazla poliçesi olabilir. Many -> Policy One -> Customer
    @JoinColumn(name = "customer_id")
    private  Customer customer;
}

