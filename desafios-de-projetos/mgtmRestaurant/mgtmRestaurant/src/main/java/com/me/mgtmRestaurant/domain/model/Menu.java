package com.me.mgtmRestaurant.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity (name = "tb_menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Food> food;

    @Embedded
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Drink> drink;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public List<Food> getFood() {
        return food;
    }
    public void setFood(List<Food> food) {
        this.food = food;
    }

    public List<Drink> getDrink() {
        return drink;
    }
    public void setDrink(List<Drink> drink) {
        this.drink = drink;
    }
}
