package com.mytests.micronaut.model.mapped_entities;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;


@JdbcRepository(dialect = Dialect.MYSQL)
public interface JsonSampleMappedEntityRepository
        extends CrudRepository<JsonSampleMappedEntity,Integer>
{


}
