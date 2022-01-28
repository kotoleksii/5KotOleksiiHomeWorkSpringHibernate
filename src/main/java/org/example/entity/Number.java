package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "numbers")
public class Number {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "phone")
    private String phone;

    public Number() {
    }

    public Number(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Number{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }
}
