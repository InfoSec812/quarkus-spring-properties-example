package com.redhat.consulting.quarkus.spring.config;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@QuarkusMain
public class Main implements QuarkusApplication {

    private static final Logger LOG = Logger.getLogger(Main.class);

    @Autowired
    AppConfig config;

    public int run(String... args) {
        LOG.info("givenName: " + config.getGivenName());
        LOG.info("familyName: " + config.getFamilyName());
        // LOG.info("birthDate: " + config.getBirthDate());

        return 0;
    }
}
