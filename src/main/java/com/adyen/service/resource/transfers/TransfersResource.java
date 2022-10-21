package com.adyen.service.resource.transfers;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

public class TransfersResource extends Resource {
    public TransfersResource(Service service) {
        super(service,
                service.getClient().getConfig().getEndpoint() + "/btl/" + Client.TRANSFER_VERSION
                        + "/transfers",
                null);
    }
}
