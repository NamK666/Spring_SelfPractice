package PSAPractice;

import org.springframework.stereotype.Component;

@Component
public interface EmailSender {
    void sendMail(String to, String subject, String body);
}
