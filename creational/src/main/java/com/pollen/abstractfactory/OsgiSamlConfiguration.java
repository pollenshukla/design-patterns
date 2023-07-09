package com.pollen.abstractfactory;

public class OsgiSamlConfiguration implements AppLoginConfigurationFactory {

    @Override
    public AppLoginConfiguration createAppLoginConfiguration() {
        SamlConfiguration samlConfiguration = new SamlConfigurationImpl();
        return samlConfiguration;
    }
}
