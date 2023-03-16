package fooddelivery.domain;

import fooddelivery.domain.Paid;
import fooddelivery.domain.PayCancled;
import fooddelivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Payment_table")
@Data

public class Payment  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private Integer customerId;
    
    
    
    
    
    private Integer orderId;

    @PostPersist
    public void onPostPersist(){


        Paid paid = new Paid(this);
        paid.publishAfterCommit();

    }
    @PostUpdate
    public void onPostUpdate(){


        PayCancled payCancled = new PayCancled(this);
        payCancled.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = FrontApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }




    public static void pay(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }
    public static void canclePay(OrderCancled orderCancled){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancled.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }


}
