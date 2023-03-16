package fooddelivery.domain;

import fooddelivery.domain.OrderAccepted;
import fooddelivery.domain.OrderRejected;
import fooddelivery.domain.CookStarted;
import fooddelivery.domain.CookFinished;
import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="FoodCooking_table")
@Data

public class FoodCooking  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private Integer storeId;
    
    
    
    
    
    private Integer orderId;
    
    
    
    
    
    private Integer foodId;
    
    
    
    
    
    private Integer customerId;

    @PostPersist
    public void onPostPersist(){


        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();



        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();

    }
    @PostUpdate
    public void onPostUpdate(){


        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }

    public static FoodCookingRepository repository(){
        FoodCookingRepository foodCookingRepository = StoreApplication.applicationContext.getBean(FoodCookingRepository.class);
        return foodCookingRepository;
    }



    public void accept(){
    }
    public void start(){
    }

    public static void startOrder(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        FoodCooking foodCooking = new FoodCooking();
        repository().save(foodCooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(foodCooking->{
            
            foodCooking // do something
            repository().save(foodCooking);


         });
        */

        
    }
    public static void cancleOrder(OrderCancled orderCancled){

        /** Example 1:  new item 
        FoodCooking foodCooking = new FoodCooking();
        repository().save(foodCooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancled.get???()).ifPresent(foodCooking->{
            
            foodCooking // do something
            repository().save(foodCooking);


         });
        */

        
    }
    public static void updateStatus(Paid paid){

        /** Example 1:  new item 
        FoodCooking foodCooking = new FoodCooking();
        repository().save(foodCooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(foodCooking->{
            
            foodCooking // do something
            repository().save(foodCooking);


         });
        */

        
    }
    public static void updateStatus(PayCancled payCancled){

        /** Example 1:  new item 
        FoodCooking foodCooking = new FoodCooking();
        repository().save(foodCooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(payCancled.get???()).ifPresent(foodCooking->{
            
            foodCooking // do something
            repository().save(foodCooking);


         });
        */

        
    }


}
