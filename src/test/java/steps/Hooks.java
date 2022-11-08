package steps;
import base.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Hooks extends Driver {
    private static final Logger LOGGER = LogManager.getLogger(Driver.class);

    @Before
    public void setUp(){
        initializeDriver();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            LOGGER.error("Test Fail");
            testFailed();
        }
        closeDriver();
        LOGGER.info("Test Başarılı");
    }
}
