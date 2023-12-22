package com.demo.patient.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patient_id;
    private String patient_name;
    private String scan_report;
}
