package org.vow.cdvv.notification;

import org.springframework.context.ApplicationEvent;
import org.vow.cdvv.core.domain.ServiceID;

public class NotificationEvent extends ApplicationEvent {
    private final ServiceID serviceID;
    private final NotificationType notificationType;

    /**
     * Create a new ApplicationEvent.
     *  @param source the object on which the event initially occurred (never {@code null})
     * @param serviceID
     * @param notificationType
     */
    public NotificationEvent(Object source, ServiceID serviceID, NotificationType notificationType) {
        super(source);
        this.serviceID = serviceID;
        this.notificationType = notificationType;
    }
}
