package lv.javaguru.java1.teacher.lesson_15_exceptions.lessoncode.libdomainmodel;

import java.util.Date;

public class Notification {

    private NotificationType type;
    private ReaderTicketItem readerTicketItem;
    private Client client;
    private Date sentDate;

}


enum NotificationType {
    SMS, EMAIL, PHONE_CALL
}