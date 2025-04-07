package com.ecom.productcatalog.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate primary key
    private Long id;

    @Column(unique = true, nullable = false) // Ensure unique email
    private String email;

    private String name;

    private String password;
}
