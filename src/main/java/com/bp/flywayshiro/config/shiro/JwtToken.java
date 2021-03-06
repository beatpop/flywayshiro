package com.bp.flywayshiro.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author DH
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return this.token;
    }

    @Override
    public Object getCredentials() {
        return this.token;
    }
}
