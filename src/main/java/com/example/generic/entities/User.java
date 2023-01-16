package com.example.generic.entities;

import com.example.generic.entities.keys.UserPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "users")
@IdClass(UserPK.class)
public class User extends EntityBase {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private String password;
    private boolean isPasswordNeverExpire;
    private Timestamp lastPasswordChangeDTM;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "middle_name")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "password_never_expire")
    public boolean isPasswordNeverExpire() {
        return isPasswordNeverExpire;
    }

    public void setPasswordNeverExpire(boolean passwordNeverExpire) {
        isPasswordNeverExpire = passwordNeverExpire;
    }

    @Basic
    @Column(name = "last_pw_change_dt")
    public Timestamp getLastPasswordChangeDTM() {
        return lastPasswordChangeDTM;
    }

    public void setLastPasswordChangeDTM(Timestamp lastPasswordChangeDTM) {
        this.lastPasswordChangeDTM = lastPasswordChangeDTM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }
}
