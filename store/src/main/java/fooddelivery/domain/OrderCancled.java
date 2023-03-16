package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;
    private Integer customerId;
    private Integer storeId;
    private Integer foodId;
    private Integer paymentId;
    private String address;
}


