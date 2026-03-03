package com.example.gestion_de_conferences.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "keynote-service", url = "${keynote.service.url:}")
public interface KeynoteClient {

    @GetMapping("/api/keynotes/{id}")
    Object getKeynoteById(@PathVariable("id") Long id);
}
