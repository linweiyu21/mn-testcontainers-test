package org.daisy.testcontainers.robot

import groovy.util.logging.Slf4j
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest(
        startApplication = false,
        environments = ['test']
)
@Slf4j
class RobotRepositorySpec extends Specification {
    
    @Inject
    RobotRepository robotRepository
    
    def 'FindById'() {
        expect:
            this.robotRepository
                .findById(id)
                .doOnNext() { log.info '{}', it }
                .block()
                .code == code
        
        where:
            id | code
            1L | 'linweiyu'
    }
    
}
