package br.com.fiap.challenge.preferences.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.fiap.challenge.preferences.model.Email;

@Repository
public class MockEmailRepository {

	public List<Email> getMockEmails() {
        return Arrays.asList(
            new Email(1, "admin@locaweb.com", "Welcome!", "Hello, welcome to our service! We're glad to have you."),
            new Email(2, "ana@otlook.com", "Order Confirmation", "Your order has been confirmed. We'll notify you once it ships."),
            new Email(3, "davi@locaweb.com", "System Maintenance", "Our system will undergo maintenance tomorrow at 3:00 AM."),
            new Email(4, "info@bol.com", "Newsletter: September", "Check out the latest news in our September newsletter!"),
            new Email(5, "support@locaweb.com", "Support Ticket Update", "Your support ticket has been updated. Please log in to check the status."),
            new Email(6, "adm@locaweb.com", "Order Confirmation", "Your order has been confirmed. We'll notify you once it ships."),
            new Email(7, "admin@locaweb.com", "System Maintenance", "Our system will undergo maintenance tomorrow at 3:00 AM."),
            new Email(8, "jose@outook.com", "Newsletter: September", "Check out the latest news in our September newsletter!"),
            new Email(9, "supportfinaceiro@gmail.com", "Support Ticket Update", "Your support ticket has been updated. Please log in to check the status."),
            new Email(10, "maria@locaweb.com", "Event Invitation", "You're invited to our annual event. We hope to see you there!"),
            new Email(11, "joao@outlook.com", "Discount Offer", "Get 20% off on your next purchase. Use code SAVE20."),
            new Email(12, "carla@locaweb.com", "Account Verification", "Please verify your account by clicking the link below."),
            new Email(13, "lucas@gmail.com", "Password Reset", "Click here to reset your password."),
            new Email(14, "patricia@bol.com", "Monthly Report", "Here is your monthly report. Review the details."),
            new Email(15, "eduardo@locaweb.com", "Feedback Request", "We value your feedback. Please take a moment to share your thoughts."),
            new Email(16, "renata@outlook.com", "New Feature", "We've added a new feature to improve your experience."),
            new Email(17, "jorge@gmail.com", "Subscription Renewal", "Your subscription is about to expire. Renew now to continue enjoying our service."),
            new Email(18, "silvia@locaweb.com", "Special Offer", "Don't miss out on our special offer! Limited time only."),
            new Email(19, "thiago@locaweb.com", "Welcome Back", "We're happy to see you back. Here's what's new since your last visit."),
            new Email(20,  "andre@bol.com", "Product Launch", "Check out our new product launch and be among the first to try it!")
        );
    }

    public List<Email> getSpamEmails() {
        return Arrays.asList(
            new Email(21, "spam1@exemplo.com", "You've won a prize!", "Click here to claim your prize."),
            new Email(22, "spam2@exemplo.com", "Get rich quick!", "Invest $1 and become a millionaire."),
            new Email(23, "spam3@exemplo.com", "Exclusive offer just for you!", "Buy one, get one free!"),
            new Email(24,  "spam4@exemplo.com", "Urgent: Your account is compromised!", "Log in immediately to secure your account."),
            new Email(25,  "spam5@exemplo.com", "Congratulations, you've been selected!", "You've been selected for a special promotion. Claim your reward now."),
            new Email(26,  "spam6@exemplo.com", "Get rich quick!", "Invest $1 and become a millionaire."),
            new Email(27,  "spam7@exemplo.com", "Exclusive offer just for you!", "Buy one, get one free!"),
            new Email(28,  "spam8@exemplo.com", "Urgent: Your account is compromised!","Log in immediately to secure your account."),
            new Email(29,  "spam9@exemplo.com", "Congratulations, you've been selected!", "You've been selected for a special promotion. Claim your reward now."),
            new Email(30,  "spam10@exemplo.com", "Limited time offer!", "Hurry up, this offer expires soon!"),
            new Email(31,  "spam11@exemplo.com", "Cheap loans available!", "Get a loan with no credit check required."),
            new Email(32,  "spam12@exemplo.com", "Click here for a free gift!","Claim your free gift by clicking this link."),
            new Email(33,  "spam13@exemplo.com", "Act now and save big!", "Limited time offer on all products."),
            new Email(34,  "spam14@exemplo.com", "Special promotion just for you!", "Get exclusive access to our sale."),
            new Email(35,  "spam15@exemplo.com", "You've been pre-approved!", "Pre-approved for a credit card. Apply now."),
            new Email(36,  "spam16@exemplo.com", "Earn money from home!", "Work from home and earn money. No experience needed."),
            new Email(37,  "spam17@exemplo.com", "Your account needs immediate attention!", "Log in to verify your account details."),
            new Email(38,  "spam18@exemplo.com", "Get paid to take surveys!", "Earn money by participating in online surveys."),
            new Email(39,  "spam19@exemplo.com", "Unlock your bonus!", "Click here to unlock your bonus."),
            new Email(40,  "spam20@exemplo.com", "Huge sale on electronics!",  "Don’t miss out on our biggest sale of the year.")
        );
    }
}
