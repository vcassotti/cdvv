package org.vow.cdvv.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.vow.cdvv.core.domain.ServiceID;
import org.vow.cdvv.notification.NotificationPublisher;

import java.util.ArrayList;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

@RestController
public class EventController {

    private final NotificationPublisher notificationPublisher;

    @Autowired
    public EventController(NotificationPublisher notificationPublisher) {
        this.notificationPublisher = notificationPublisher;
    }

    @GetMapping("/events")
    @ResponseStatus(OK)
    @ResponseBody
    public Events allEvents() {
        return new Events();
    }

    @GetMapping("/notify")
    @ResponseStatus(NO_CONTENT)
    public void sendNotif() {
        notificationPublisher.sendNotification(this, new ServiceID("1"));
    }

    static class Events
            extends ArrayList<Event> {
    }
}
