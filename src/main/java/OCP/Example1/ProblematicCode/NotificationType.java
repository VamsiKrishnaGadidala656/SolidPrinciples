package OCP.Example1.ProblematicCode;

public enum NotificationType {

    SMS,
    EMAIL,
    WHATSAPP;

    public  void sendSMSNotification() {
        System.out.println("Sending SMS notification");
    }

    public  void sendEmailNotification() {
        System.out.println("Sending EMAIL notification");
    }

    public  void sendWhatsappNotification() {
        System.out.println("Sending Whatsapp notification");
    }

    /*
        Extensibility::
        we are not able extend/add new feature with modifying notificationSender class
     */

    /*

     */
}
