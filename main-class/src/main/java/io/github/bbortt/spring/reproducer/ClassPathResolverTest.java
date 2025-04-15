package io.github.bbortt.spring.reproducer;

import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassPathResolverTest {

    public static void main(final String[] args) throws IOException {
        var resources = new PathMatchingResourcePatternResolver()
                .getResources("classpath*:**/*Test.xml");

        assertThat(resources)
                .hasSize(1);
    }
}
