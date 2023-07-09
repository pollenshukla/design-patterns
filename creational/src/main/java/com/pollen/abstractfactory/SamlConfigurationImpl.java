package com.pollen.abstractfactory;

public class SamlConfigurationImpl implements SamlConfiguration {
    @Override
    public LoginConfig getLoginConfig() {
        return new LoginConfig("SAML");
    }
}
