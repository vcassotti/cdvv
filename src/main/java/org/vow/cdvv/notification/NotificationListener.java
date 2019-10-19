package org.vow.cdvv.notification;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class NotificationListener
        implements ApplicationListener<NotificationEvent> {
    private final static Logger logger = Logger.getLogger("NotificationListener");
    @Override
    public void onApplicationEvent(NotificationEvent event) {
        logger.info("notification " + event);
    }
}
