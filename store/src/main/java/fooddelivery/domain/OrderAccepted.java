package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private Integer foodId;
    private Integer orderId;
    private Integer storeId;
    private Integer customerId;

    public OrderAccepted(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
