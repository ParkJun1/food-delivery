package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;
    private Integer storeId;
    private Integer orderId;
    private Integer foodId;
    private Integer customerId;

    public CookStarted(FoodCooking aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}
