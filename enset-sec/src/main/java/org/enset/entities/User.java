package org.enset.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="users")
public class User implements Serializable {
    @Id
    private String username;
    private String password;
    private  boolean activate;
    @ManyToMany
    @JoinTable(name="USERS_ROLES")
    private Collection<Role> roles;

    public User(String username, String password, Collection<Role> roles) {
        super();
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public User() {

    }

    public User(String username, String password, boolean activate, Collection<Role> roles) {
        this.username = username;
        this.password = password;
        this.activate = activate;
        this.roles = roles;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}
