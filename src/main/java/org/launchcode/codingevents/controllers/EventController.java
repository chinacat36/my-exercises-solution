package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("events")
public class EventController {

//    @GetMapping
//    public String displayAllEvents(Model model) {
//        return "events/index";
//    }

    private static Map<String, String> events = new HashMap<>();
    @GetMapping
    public String displayAllEvents(Model model){
        events.put("Code till Dawn", "Coding meet-up on Fridays until 1AM");
        events.put("Code With Pride", "Coding meet-up for LGBTQ community");
        events.put("Strange Loop", "Coding event that sounds fun!");
        System.out.println(events.values());
        return "events/index";
    }
    public static Map<String, String> getEvents() {
        return events;
    }
}



