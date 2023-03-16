package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String status;
    private Integer storeId;
    private Integer orderId;
    private Integer foodId;
    private Integer customerId;
}


