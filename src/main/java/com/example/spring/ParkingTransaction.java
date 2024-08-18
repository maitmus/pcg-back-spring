package com.example.spring;

import com.example.spring.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "parking_transaction", schema = "pcg")
public class ParkingTransaction {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "entry_time", nullable = false)
    private Long entryTime;

    @Column(name = "exit_time")
    private Long exitTime;

    @Column(name = "charge_start_time")
    private Long chargeStartTime;

    @Column(name = "charge_time")
    private Integer chargeTime;

    @Column(name = "payment_time")
    private Long paymentTime;

    @Column(name = "charge_amount")
    private Integer chargeAmount;

    @Column(name = "parking_amount")
    private Integer parkingAmount;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Size(max = 15)
    @NotNull
    @Column(name = "car_num", nullable = false, length = 15)
    private String carNum;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "is_paid", nullable = false)
    private Byte isPaid;

    @Size(max = 36)
    @NotNull
    @Column(name = "payment_id", nullable = false, length = 36)
    private String paymentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "parkId")
    private Park park;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "carId")
    private Car car;

}