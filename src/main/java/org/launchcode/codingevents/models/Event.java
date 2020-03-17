package org.launchcode.codingevents.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Objects;


public class Event {

    private int id;
    private static int nextId = 1;

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

    //@Size(min = 0)
    private int attendees;

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public Event(String name, String description,
                 String contactEmail, String date,
                 String location, Boolean registration,
                 int attendees) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.date = date;
        this.location = location;
        this.registration = registration;
        this.attendees = attendees;
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

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
