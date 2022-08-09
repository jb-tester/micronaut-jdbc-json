package com.mytests.micronaut.model.entities;

import io.micronaut.data.annotation.TypeDef;
import io.micronaut.data.model.DataType;
import io.micronaut.serde.annotation.Serdeable;

import javax.persistence.*;
import java.util.Map;


@Serdeable
@Entity
@Table(name = "json_sample", schema = "micronaut")
public class JsonSampleEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    private String name;

    @Basic
    @Column(name = "properties")
    @TypeDef(type = DataType.JSON)
    private Map<String, String> properties;

    @Basic
    @Column(name = "advanced")
    @TypeDef(type = DataType.JSON)
    private Map<String, String[]> advanced;


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


    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }


    public Map<String, String[]> getAdvanced() {
        return advanced;
    }

    public void setAdvanced(Map<String, String[]> advanced) {
        this.advanced = advanced;
    }
}
