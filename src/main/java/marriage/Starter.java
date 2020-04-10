package marriage;

import marriage.rest.MarriageController;
import marriage.view.MarriageRequest;
import marriage.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    private static final Logger LOGGER = LoggerFactory.getLogger(Starter.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"springContext.xml"}
        );

        MarriageController controller = context.getBean("controller", MarriageController.class);
        MarriageResponse qwe123 = controller.findMarriageCertificate(new MarriageRequest());

    }
}
