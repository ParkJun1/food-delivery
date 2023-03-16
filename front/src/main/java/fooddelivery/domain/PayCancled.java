package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PayCancled extends AbstractEvent {

    private Long id;
    private String status;
    private Integer customerId;
    private Integer orderId;

    public PayCancled(Payment aggregate){
        super(aggregate);
    }
    public PayCancled(){
        super();
    }
}
