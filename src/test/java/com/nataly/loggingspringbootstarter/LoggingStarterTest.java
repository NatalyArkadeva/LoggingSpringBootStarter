package com.nataly.loggingspringbootstarter;

import com.nataly.loggingspringbootstarter.interceptor.LoggingInterceptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggingStarterTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(LoggingInterceptor.class));

    @Test
    void containsBean() {
        contextRunner.run(context -> assertTrue(context.containsBean("loggingInterceptor")));
    }
}
