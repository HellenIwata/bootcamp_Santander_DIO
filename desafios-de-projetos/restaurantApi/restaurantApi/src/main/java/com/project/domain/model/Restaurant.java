package domain.model;

import jakarta.persistence.*;

@Entity(name="tb_restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Information information;

    @OneToOne(cascade = CascadeType.ALL)
    private Menu menu;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Information getInformation() {
        return information;
    }
    public void setInformation(Information information) {
        this.information = information;
    }

    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
