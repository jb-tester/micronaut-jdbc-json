package com.mytests.micronaut.model.entities;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;


@JdbcRepository(dialect = Dialect.MYSQL)
public interface JsonSampleEntityRepository
        extends CrudRepository<JsonSampleEntity,Integer>
{


}
