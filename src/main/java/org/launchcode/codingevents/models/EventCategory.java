package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EventCategory extends AbstractEntity{

    @OneToMany(mappedBy = "eventCategory")
    private final List<Event> events = new ArrayList<>();

    @NotBlank(message="Name is required.")
    @Size(min=1, max=50, message="Must be 1-50 characters.")
    private String name;

    @OneToOne(mappedBy = "eventDetails")
    private Event event;

    public EventCategory(){}
    public EventCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {return name;}
}
