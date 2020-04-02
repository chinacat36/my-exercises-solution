package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity{

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @Size(max = 500, message = "Description too long.")
    private String description;

    public EventDetails(@NotBlank(message = "Email is required.")
                        @Email(message = "Invalid email. Try again.") String contactEmail,
                        @Size(max = 500, message = "Description too long.")String description) {
        this.contactEmail = contactEmail;
        this.description = description;
    }

    public EventDetails(){}

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
