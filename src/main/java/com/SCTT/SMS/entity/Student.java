package com.SCTT.SMS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "student")

public class Student {
    @Id
    @Column(name="index_no")
    private String indexNo;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="date_of_birth")
    private String dateOfBirth;
    @Column(name="gender")
    private String gender;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name="nic_no")
    private String nicNo;
    @Column(name="degree")
    private String degree;
}
