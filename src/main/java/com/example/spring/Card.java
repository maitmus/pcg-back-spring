package com.example.spring;

import com.example.spring.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "card", schema = "pcg")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "number", nullable = false, length = 100)
    private String number;

    @Size(max = 2)
    @NotNull
    @Column(name = "expiry_year", nullable = false, length = 2)
    private String expiryYear;

    @Size(max = 2)
    @NotNull
    @Column(name = "expiry_month", nullable = false, length = 2)
    private String expiryMonth;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}