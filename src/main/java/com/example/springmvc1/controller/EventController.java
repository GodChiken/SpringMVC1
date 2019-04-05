package com.example.springmvc1.controller;

import com.example.springmvc1.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class EventController {

	private EventService eventService;

    @GetMapping("/events")
    public String events(Model model){
    	model.addAttribute("events",eventService.getEvents());
        return "events";
    }
}
