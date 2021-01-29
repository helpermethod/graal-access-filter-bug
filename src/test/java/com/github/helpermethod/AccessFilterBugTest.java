package com.github.helpermethod;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.testcontainers.utility.DockerImageName.parse;

@Testcontainers
class AccessFilterBugTest {
    @Container
    KafkaContainer kafka =
        new KafkaContainer(parse("confluentinc/cp-kafka:6.0.1"));

    @Test
    public void access_filter_should_filter_out_bind_class() {
        AccessFilterBug.main(new String[]{});
    }
}