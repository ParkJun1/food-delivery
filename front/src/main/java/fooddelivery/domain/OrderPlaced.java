package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Integer customerId;
    private Integer storeId;
    private Integer foodId;
    private Integer paymentId;
    private String address;

    public OrderPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
