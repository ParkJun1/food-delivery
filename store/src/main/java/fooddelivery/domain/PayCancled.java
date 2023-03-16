package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PayCancled extends AbstractEvent {

    private Long id;
    private String status;
    private Integer customerId;
    private Integer orderId;
}


