package com.me.mgtmRestaurant.domain.model;

import jakarta.persistence.*;

@Entity (name = "tb_information")
public class Information {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String type;
    private String category;
    private String description;
    private String delivery;
    private String methodPayment;

    @Embedded
    private Adress adress;

    public Adress getAdress() {
        return adress;
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDelivery() {
        return delivery;
    }
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMethodPayment() {
        return methodPayment;
    }
    public void setMethodPayment(String methodPayment) {
        this.methodPayment = methodPayment;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
