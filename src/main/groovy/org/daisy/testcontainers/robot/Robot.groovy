package org.daisy.testcontainers.robot

import groovy.transform.Canonical
import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*

import javax.validation.constraints.Size
import java.time.LocalDateTime

@Canonical
@Introspected
@MappedEntity('robot')
class Robot implements Serializable {
    @Id
    @GeneratedValue
    Long          id
    @Size(max = 255)
    String        code
    @DateCreated
    LocalDateTime dateCreated
    @DateUpdated
    LocalDateTime dateUpdated
}
