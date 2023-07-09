package com.pollen.abstractfactory;

public class OsgiOauthConfiguration implements AppLoginConfigurationFactory {

    @Override
    public AppLoginConfiguration createAppLoginConfiguration() {
        OauthConfiguration oauthConfiguration = new OauthConfigurationImpl();
        return oauthConfiguration;
    }
}
