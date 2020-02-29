import com.jiepi.common.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunConsumer {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");

        SomeService someService = (SomeService) ac.getBean("someService");
        String name = someService.hello("洁癖");
        System.out.println(name);
    }
}
