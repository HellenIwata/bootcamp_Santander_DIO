package com.classification.client_classification.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate registrationDate;
    private Double totalMonthlyConsum;
    private String classify;
    private String gift;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public LocalDate getRegistrationDate(){
        return registrationDate;
    }
    public void setRegistrationDate(LocalDate registrationDate){
        this.registrationDate = registrationDate;
    }

    public Double totalMonthlyConsum(){
        return totalMonthlyConsum;
    }
    public void setTotalMonthlyConsum(Double totalMonthlyConsum){
        this.totalMonthlyConsum = totalMonthlyConsum;
    }
    public Double getTotalMonthlyConsum() {
        return totalMonthlyConsum;
    }
    public String getClassify() {
        return classify;
    }
    public void setClassify(String classify) {
        this.classify = classify;
    }
    public String getGift() {
        return gift;
    }
    public void setGift(String gift) {
        this.gift = gift;
    }

    
}
