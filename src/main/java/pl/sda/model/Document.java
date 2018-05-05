package pl.sda.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private Set<Sell> sells;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    /**
     * Dodaje sprzedaze do kolekcji pojedynczo.
     *
     * @param sell
     */
    public void addSell(Sell sell) {
        if (sells == null) {
            sells = new HashSet<Sell>();
        }
        sells.add(sell);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Sell> getSells() {
        return sells;
    }

    public void setSells(Set<Sell> sells) {
        this.sells = sells;
    }
}
