package com.example.spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "migrations", schema = "pcg")
public class Migration {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "timestamp", nullable = false)
    private Long timestamp;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

}