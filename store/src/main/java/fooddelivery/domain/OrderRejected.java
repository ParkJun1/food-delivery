package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String status;
    private Integer foodId;
    private Integer orderId;
    private Integer storeId;
    private Integer customerId;

    public OrderRejected(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
