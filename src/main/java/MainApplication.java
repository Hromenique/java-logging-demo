import br.com.hrom.loggingdemo.examples.Log4j2Example;
import br.com.hrom.loggingdemo.examples.Slf4JWithLogbackExample;
import org.apache.logging.log4j.ThreadContext;
import org.slf4j.MDC;

public class MainApplication {

    public static void main(String[] args) {
        // log4j works with ThreadContext
        ThreadContext.put("PID", String.valueOf(ProcessHandle.current().pid()));
        new Log4j2Example().show();

        System.out.println("----------------------------------------------------------------");

        // logback works with MDC
        MDC.put("PID", String.valueOf(ProcessHandle.current().pid()));
        new Slf4JWithLogbackExample().show();
    }
}
