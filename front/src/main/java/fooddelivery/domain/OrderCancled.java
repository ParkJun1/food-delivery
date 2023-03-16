package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;
    private Integer customerId;
    private Integer storeId;
    private Integer foodId;
    private Integer paymentId;
    private String address;

    public OrderCancled(Order aggregate){
        super(aggregate);
    }
    public OrderCancled(){
        super();
    }
}
