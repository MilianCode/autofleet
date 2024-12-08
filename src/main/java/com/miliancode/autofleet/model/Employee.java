package com.miliancode.autofleet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Entity
@SQLDelete(sql = "UPDATE employees SET is_deleted = true WHERE id=?")
@SQLRestriction("is_deleted = false")
@Table(name = "employees")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
    @OneToOne
    private User user;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;
}
