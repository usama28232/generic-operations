package com.example.generic.entities.keys;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MenuPK implements Serializable {

    private String org;
    private String menu;

    @Id
    @Column(name = "org", nullable = false)
    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Id
    @Column(name = "menu", nullable = false)
    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuPK menuPK = (MenuPK) o;
        return org.equals(menuPK.org) && menu.equals(menuPK.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(org, menu);
    }
}
