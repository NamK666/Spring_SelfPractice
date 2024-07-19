package PSAPractice;

public class AwsSesSender implements EmailSender{
    @Override
    public void sendMail(String to, String subject, String body) {
        System.out.println("Sending AWSSES to " + to);
    }
}
