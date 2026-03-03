package com.example.gestion_de_conferences.dto.conference;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateConferenceDTO {
    private String title;
    private String description;
    private String location;
    private String startDate;
    private String endDate;
    private long keynoteSpeakerId;
}
