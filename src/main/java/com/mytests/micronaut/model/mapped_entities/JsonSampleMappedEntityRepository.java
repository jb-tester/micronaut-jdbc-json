package com.mytests.micronaut.model.mapped_entities;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;


@JdbcRepository(dialect = Dialect.MYSQL)
public interface JsonSampleMappedEntityRepository
        extends CrudRepository<JsonSampleMappedEntity,Integer>
{

    @Query("select * from micronaut.json_sample  where JSON_EXTRACT(properties, '$.prop11') = :value")
    List<JsonSampleMappedEntity> findByProperties(@Parameter("value") String value);
}
