package com.mytests.micronaut.model.mapped_entities;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.TypeDef;
import io.micronaut.data.model.DataType;
import io.micronaut.serde.annotation.Serdeable;


import java.util.Map;


@MappedEntity("json_sample")
@Serdeable
public class JsonSampleMappedEntity {

    private int id;

    private String name;


    private Map<String, String> properties;


    private Map<String, String[]> advanced;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @TypeDef(type = DataType.JSON)
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @TypeDef(type = DataType.JSON)
    public Map<String, String[]> getAdvanced() {
        return advanced;
    }

    public void setAdvanced(Map<String, String[]> advanced) {
        this.advanced = advanced;
    }
}
