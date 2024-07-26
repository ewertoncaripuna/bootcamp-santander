import me.dio.web.domain.CRM;
import me.dio.web.domain.Customer;
import me.dio.web.domain.SMSStrategy;

public class Main {
    public static void main(String[] args) {

        CRM crm = new CRM();

        crm.addCustomer(new Customer("Venilton", "123456789"));

        System.out.println();

        crm.setMessageStrategy(new SMSStrategy());
        crm.sendMessageToAll("Olá, cliente! Temos uma oferta especial para você.");
    }
}
