package org.vow.cdvv.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class EventController {

    @GetMapping("/events")
    @ResponseStatus(OK)
    @ResponseBody
    public Events allEvents() {
        return new Events();
    }

    static class Events
            extends ArrayList<Event> {
    }
}
