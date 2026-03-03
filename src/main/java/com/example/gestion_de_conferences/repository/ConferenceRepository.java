package com.example.gestion_de_conferences.repository;

import com.example.gestion_de_conferences.entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
