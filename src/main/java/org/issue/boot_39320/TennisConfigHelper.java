package org.issue.boot_39320;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.env.Environment;

public class TennisConfigHelper implements ConfigHelper {
    @Override
    public SubscriberFeedsConfig getSubscriberFeedsConfig(Environment environment) {
        return Binder.get(environment).bind("feeds", SubscriberFeedsConfig.class).get();
    }
}