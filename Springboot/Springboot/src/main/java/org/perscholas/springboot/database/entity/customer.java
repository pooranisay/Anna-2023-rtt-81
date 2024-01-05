package org.perscholas.springboot.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="customers")
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "city")
    private String city;

    @Column(name = "image_url")
    private String imageurl;

    @Column(name = "user_id")
    private Integer userId;
}
