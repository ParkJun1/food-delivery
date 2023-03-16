package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
    private String status;
    private Integer orderId;
    private Integer storeId;
    private Integer foodId;
    private String address;

    public Picked(Delivery aggregate){
        super(aggregate);
    }
    public Picked(){
        super();
    }
}
