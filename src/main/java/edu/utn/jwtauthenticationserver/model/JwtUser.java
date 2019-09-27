package edu.utn.jwtauthenticationserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@AllArgsConstructor
public class JwtUser implements UserDetails {

    private final String username;
    private final String password;
    private final Collection<? extends GrantedAuthority> authorities;
    private final boolean enabled;

    @Override
    public boolean isAccountNonExpired() {
        return true; // Returning true, as this property is disabled
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Returning true, as this property is disabled
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Returning true, as this property is disabled
    }
}
