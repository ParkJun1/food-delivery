package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;
    private Integer storeId;
    private Integer orderId;
    private Integer foodId;
    private Integer customerId;
}
