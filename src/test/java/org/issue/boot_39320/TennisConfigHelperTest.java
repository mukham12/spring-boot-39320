package org.issue.boot_39320;

import org.junit.jupiter.api.Test;
import org.springframework.mock.env.MockEnvironment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TennisConfigHelperTest {

    private final TennisConfigHelper helper = new TennisConfigHelper();

    @Test
    public void shouldGetSubscriberFeedsConfig() {
        MockEnvironment environment = new MockEnvironment()
                .withProperty("feeds.messageHelperClass", "TennisMessageHelper")
                .withProperty("feeds.configHelperClass", "TennisConfigHelper");

        SubscriberFeedsConfig subscriberFeedsConfig = helper.getSubscriberFeedsConfig(environment);

        assertNotNull(subscriberFeedsConfig);
        assertEquals("TennisMessageHelper", subscriberFeedsConfig.getMessageHelperClass());
        assertEquals("TennisConfigHelper", subscriberFeedsConfig.getConfigHelperClass());
    }
}
