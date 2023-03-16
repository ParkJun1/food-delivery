package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class PayCancled extends AbstractEvent {

    private Long id;
    private String status;
    private Integer customerId;
    private Integer orderId;
}
