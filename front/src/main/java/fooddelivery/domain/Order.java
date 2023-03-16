package fooddelivery.domain;

import fooddelivery.domain.OrderPlaced;
import fooddelivery.domain.OrderCancled;
import fooddelivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Integer customerId;
    
    
    
    
    
    private Integer storeId;
    
    
    
    
    
    private Integer foodId;
    
    
    
    
    
    private Integer paymentId;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }
    @PostUpdate
    public void onPostUpdate(){


        OrderCancled orderCancled = new OrderCancled(this);
        orderCancled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
