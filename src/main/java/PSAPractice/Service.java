package PSAPractice;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    private final EmailSender emailSender;

    @Autowired
    public Service(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmail(String to, String subject, String body) {
        emailSender.sendMail(to, subject, body);
    }
}
