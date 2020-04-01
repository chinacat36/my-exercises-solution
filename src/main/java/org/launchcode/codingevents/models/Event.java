package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;

@Entity
public class Event extends AbstractEntity{

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3-50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long.")
    private String description;

    //@FutureOrPresent
    @NotBlank(message = "Date is required.")
    private String date;

    @NotBlank(message = "Location required.")
    private String location;

    @AssertTrue(message = "You must register")
    private Boolean registration;

    @ManyToOne
    @NotNull(message = "Category is required.")
    private EventCategory eventCategory;

    public Event() {}

    public Event(String name, String description,
                 String contactEmail, String date,
                 String location, Boolean registration,
                 EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.date = date;
        this.location = location;
        this.registration = registration;
        this.eventCategory = eventCategory;
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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getRegistration() {
        return registration;
    }

    public void setRegistration(Boolean registration) {
        this.registration = registration;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return name;
    }

}
