package PSAPractice;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailApplication {
    public static void main(String[] args) {
        Service smtpSender = new Service(new SmtpEmailSender());
        Service awsSender = new Service(new AwsSesSender());

        smtpSender.sendEmail("draco","hello","whatsup");
        awsSender.sendEmail("draco","hello","whatsup");
    }
}
