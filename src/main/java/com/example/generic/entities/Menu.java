package com.example.generic.entities;

import com.example.generic.entities.keys.MenuPK;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@IdClass(MenuPK.class)
@Table(name = "menu")
public class Menu extends EntityBase implements Serializable {

    private String org;
    private String menu;
    private String description;
    private String template;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu1 = (Menu) o;
        return org.equals(menu1.org) && menu.equals(menu1.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(org, menu);
    }
}
