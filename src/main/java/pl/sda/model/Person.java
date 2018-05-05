package pl.sda.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Person extends Customer {
    @Column
    private String pesel;
    @Column
    private String lastName;

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
