package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Delivered extends AbstractEvent {

    private Long id;
    private String status;
    private Integer orderId;
    private Integer storeId;
    private Integer foodId;
    private String address;
}


