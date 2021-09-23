package org.gana.test1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This is a test entity
 */
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private long personId;
    @Column(name = "login")
    private String login;
    @Column(name = "label")
    private String label;

    public Person() {
    }

    public Person(long personId, String label) {
        this.personId = personId;
        this.label = label;
    }

    public long getPersonId() {
        return this.personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    
    @Override
    public String toString() {
        return "{" + " personId='" + getPersonId() + "'" + ", label='" + getLabel() + "'" + "}";
    }

}