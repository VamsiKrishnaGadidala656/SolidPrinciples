package OCP.Example1.ProblematicCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<NotificationType> notificationTypeList) {

        for (NotificationType notificationType : notificationTypeList) {
            if (notificationType == NotificationType.SMS) {
                notificationType.sendSMSNotification();
            } else if (notificationType == NotificationType.EMAIL) {
                notificationType.sendEmailNotification();
            } else if (notificationType == NotificationType.WHATSAPP) {
                notificationType.sendWhatsappNotification();
            }
        }
    }
}
