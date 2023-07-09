package com.pollen.abstractfactory;

public class LoginConfig {
    private String loginConfig;

    public LoginConfig(String loginConfig) {
        this.loginConfig = loginConfig;
    }

    public String getLoginConfig() {
        return loginConfig;
    }

    public void setLoginConfig(String loginConfig) {
        this.loginConfig = loginConfig;
    }

    @Override
    public String toString() {
        return "LoginConfig{" +
                "loginConfig='" + loginConfig + '\'' +
                '}';
    }
}
