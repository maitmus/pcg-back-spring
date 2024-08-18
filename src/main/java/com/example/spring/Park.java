package com.example.spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "park", schema = "pcg")
public class Park {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Size(max = 15)
    @NotNull
    @Column(name = "phone", nullable = false, length = 15)
    private String phone;

    @Size(max = 100)
    @NotNull
    @Column(name = "address", nullable = false, length = 100)
    private String address;

    @NotNull
    @Column(name = "total_space", nullable = false)
    private Integer totalSpace;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "car_space", nullable = false)
    private Integer carSpace;

    @NotNull
    @Column(name = "disability_space", nullable = false)
    private Integer disabilitySpace;

    @Size(max = 100)
    @NotNull
    @Column(name = "manage_code", nullable = false, length = 100)
    private String manageCode;

    @Size(max = 20)
    @NotNull
    @Column(name = "ip", nullable = false, length = 20)
    private String ip;

/*
TODO [리버스 엔지니어링] 필드를 생성하여 'location' 열에 매핑
사용 가능한 액션: 대상 Java 타입 정의 | 현재 상태대로 주석 해제 | 열 매핑 제거
    @Column(name = "location", columnDefinition = "point not null")
    private Object location;
*/
}