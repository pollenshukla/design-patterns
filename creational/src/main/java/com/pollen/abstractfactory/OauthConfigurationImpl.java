package com.pollen.abstractfactory;

public class OauthConfigurationImpl implements OauthConfiguration {
    @Override
    public LoginConfig getLoginConfig() {
        return new LoginConfig("OAUTH");
    }
}
