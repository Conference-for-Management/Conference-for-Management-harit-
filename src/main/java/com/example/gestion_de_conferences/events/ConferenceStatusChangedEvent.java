package com.example.gestion_de_conferences.events;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConferenceStatusChangedEvent {

    private Long conferenceId;
    private String oldStatus;
    private String newStatus;
}
