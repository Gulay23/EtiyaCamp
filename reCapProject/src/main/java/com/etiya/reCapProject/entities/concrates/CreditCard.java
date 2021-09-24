
  package com.etiya.reCapProject.entities.concrates;
  
 
  
  import javax.persistence.Column; import javax.persistence.Entity; import
  javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
  import javax.persistence.Id; import javax.persistence.JoinColumn; import
  javax.persistence.ManyToOne; import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor; import lombok.Data; import
  lombok.NoArgsConstructor;
  
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  @Entity
  @Table(name="credit_cards") 
  @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
  public class CreditCard {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name="id") 
  private int id;
  
  @Column(name="card_name")
  private String cardName;
  
  @Column(name="card_number")
  private String cardNumber;
  
  @Column(name="cvv") 
  private String cvv;
  
  @Column(name="last_date")
  private String lastDate;
  
  @ManyToOne
  @JoinColumn(name="customer_id") 
  private Customer customer;
  
  }
 