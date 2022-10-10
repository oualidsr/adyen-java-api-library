package com.adyen.service.resource.balancePlatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

public class BalancePlatformResource extends Resource {
    public BalancePlatformResource(Service service, String endpoint) {
        super(service, service.getClient().getConfig().getBalancePlatformEndpoint() + "/" + Client.BALANCE_PLATFORM_VERSION + endpoint, null);
    }
}
