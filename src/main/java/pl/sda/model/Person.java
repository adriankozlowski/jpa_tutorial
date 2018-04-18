package pl.sda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Person {

    @GeneratedValue
    @Id
    private Integer id;
    @OneToMany(mappedBy = "person")
    private Set<Address> addreses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Address> getAddreses() {
        return addreses;
    }

    public void setAddreses(Set<Address> addreses) {
        this.addreses = addreses;
    }
}
