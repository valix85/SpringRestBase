package org.springrestbase.Entity;

/**
 * Created by Valerio on 26/06/2017.
 */
public class Topic {

    Integer     id;
    String      name;
    String      description;

    public Topic() {} //semplice obbligatorio per JPA/Hibernate e vari ORM

    public Topic(Integer id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
