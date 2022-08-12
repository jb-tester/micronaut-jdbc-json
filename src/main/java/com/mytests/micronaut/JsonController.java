package com.mytests.micronaut;

import com.mytests.micronaut.model.entities.JsonSampleEntity;
import com.mytests.micronaut.model.entities.JsonSampleEntityRepository;
import com.mytests.micronaut.model.mapped_entities.JsonSampleMappedEntity;
import com.mytests.micronaut.model.mapped_entities.JsonSampleMappedEntityRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;

import java.util.List;


@Controller
public class JsonController {

    @Inject
    JsonSampleEntityRepository entityRepository;
    @Inject
    JsonSampleMappedEntityRepository mappedEntityRepository;

    @Get("/all_entities")
    public List<JsonSampleEntity> getAllEntities() {
        return (List<JsonSampleEntity>) entityRepository.findAll();
    }

    @Get("/all_mapped_entities")
    public List<JsonSampleMappedEntity> getAllMappedEntities() {
        return (List<JsonSampleMappedEntity>) mappedEntityRepository.findAll();
    }
    @Get("/mappingEntitiesByProp/{prop}")
    public List<JsonSampleMappedEntity> getByProp(@PathVariable String prop) {
        return mappedEntityRepository.findByProperties(prop);
    }
}
