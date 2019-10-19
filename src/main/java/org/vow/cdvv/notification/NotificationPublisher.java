package org.vow.cdvv.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.vow.cdvv.core.domain.ServiceID;

import static org.vow.cdvv.notification.NotificationType.StatusDown;

@Component
public class NotificationPublisher {
    private final ApplicationEventPublisher eventPublisher;
    @Autowired
    public NotificationPublisher(ApplicationEventPublisher eventPublisher){
        this.eventPublisher = eventPublisher;
    }
    public void sendNotification(Object source, ServiceID serviceID) {
        eventPublisher.publishEvent(new NotificationEvent(source, serviceID, StatusDown));
    }
}
