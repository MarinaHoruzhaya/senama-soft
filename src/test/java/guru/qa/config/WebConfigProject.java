package guru.qa.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class WebConfigProject {
    private final WebConfig webConfig;

    public WebConfigProject(WebConfig webConfig){
        this.webConfig = webConfig;
    }
    public void webConfig() {
        Configuration.browser = webConfig.getBrowser().toString();
        Configuration.baseUrl = webConfig.getBaseUrl();
        Configuration.browserSize = webConfig.getBrowserSize();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        Configuration.pageLoadStrategy = "eager";

        if (webConfig.isRemote()) {
            Configuration.remote = webConfig.getRemoteURL();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.of(
                    "enableVNC", true,
                    "enableVideo", true

            ));
            Configuration.browserCapabilities = capabilities;
        }
    }
}
