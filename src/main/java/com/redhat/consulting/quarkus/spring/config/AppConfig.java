package com.redhat.consulting.quarkus.spring.config;

import java.util.Date;
import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "deven")
public class AppConfig {

    String givenName;

    String familyName;

    String birthDate;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppConfig appConfig = (AppConfig) o;
        return Objects.equals(givenName, appConfig.givenName) && Objects.equals(familyName, appConfig.familyName) && Objects.equals(birthDate, appConfig.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(givenName, familyName, birthDate);
    }
}
