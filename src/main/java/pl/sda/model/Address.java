package pl.sda.model;

import javax.persistence.*;

@Entity
public class Address {
    @GeneratedValue
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
