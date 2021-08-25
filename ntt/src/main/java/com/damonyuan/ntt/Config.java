package com.damonyuan.ntt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Value("${env.profile}")
    private String profileName;
    @Value("${env.name}")
    private String envName;

    public String getProfileName() {
        return profileName;
    }

    public String getEnvName() {
        return envName;
    }
}
