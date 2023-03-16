package fooddelivery.domain;

import fooddelivery.NotifyApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Notification_table")
@Data

public class Notification  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static NotificationRepository repository(){
        NotificationRepository notificationRepository = NotifyApplication.applicationContext.getBean(NotificationRepository.class);
        return notificationRepository;
    }




    public static void notify(Picked picked){

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        */

        /** Example 2:  finding and process
        
        repository().findById(picked.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);


         });
        */

        
    }
    public static void notify(OrderAccepted orderAccepted){

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);


         });
        */

        
    }
    public static void notify(OrderRejected orderRejected){

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);


         });
        */

        
    }
    public static void notify(CookStarted cookStarted){

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);


         });
        */

        
    }
    public static void notify(CookFinished cookFinished){

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookFinished.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);


         });
        */

        
    }
    public static void notify(Delivered delivered){

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        */

        /** Example 2:  finding and process
        
        repository().findById(delivered.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);


         });
        */

        
    }


}
