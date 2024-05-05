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
@Table(name = "course")

public class Course {
    @Id
    @Column(name="index_no")
    private String indexNo;
    @Column(name="semester")
    private String semester;
    @Column(name="course_1", nullable = false)
    private String course1;
    @Column(name="course_2" , nullable = false)
    private String course2;
    @Column(name="course_3", nullable = false )
    private String course3;
    @Column(name="course_4", nullable = false)
    private String course4;
    @Column(name="course_5", nullable = false)
    private String course5;
    @Column(name="course_6", nullable = false)
    private String course6;
    @Column(name="course_7", nullable = false)
    private String course7;
    @Column(name="course_8", nullable = false)
    private String course8;
}
