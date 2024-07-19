package PSAPractice;

public class SmtpEmailSender implements EmailSender {
    @Override
    public void sendMail(String to, String subject, String body) {
        System.out.println("Sending SMTP email to " + to);
    }
}
