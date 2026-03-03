package com.example.gestion_de_conferences.mapper;

import com.example.gestion_de_conferences.dto.conference.ConferenceResponseDTO;
import com.example.gestion_de_conferences.dto.conference.CreateConferenceDTO;
import com.example.gestion_de_conferences.dto.conference.UpdateConferenceDTO;
import com.example.gestion_de_conferences.entity.Conference;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ConferenceMapper {

    Conference toEntity(CreateConferenceDTO dto);

    ConferenceResponseDTO toResponseDTO(Conference conference);

    void updateEntity(UpdateConferenceDTO dto, @MappingTarget Conference conference);
}
