package com.example.gestion_de_conferences.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "conferences")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String startDate;

    @Column(nullable = false)
    private String endDate;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private long keynoteSpeakerId;
}
