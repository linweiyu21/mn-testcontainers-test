package org.daisy.testcontainers.robot

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactorPageableRepository

@R2dbcRepository(dialect = Dialect.MYSQL)
interface RobotRepository extends ReactorPageableRepository<Robot, Long> {
}
