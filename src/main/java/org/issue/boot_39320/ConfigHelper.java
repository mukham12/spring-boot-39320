package org.issue.boot_39320;

import org.springframework.core.env.Environment;

public interface ConfigHelper {
    SubscriberFeedsConfig getSubscriberFeedsConfig(Environment environment);
}