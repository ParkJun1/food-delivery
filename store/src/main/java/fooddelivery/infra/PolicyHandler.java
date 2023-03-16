package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired FoodCookingRepository foodCookingRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_StartOrder(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener StartOrder : " + orderPlaced + "\n\n");


        

        // Sample Logic //
        FoodCooking.startOrder(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCancled'")
    public void wheneverOrderCancled_CancleOrder(@Payload OrderCancled orderCancled){

        OrderCancled event = orderCancled;
        System.out.println("\n\n##### listener CancleOrder : " + orderCancled + "\n\n");


        

        // Sample Logic //
        FoodCooking.cancleOrder(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_UpdateStatus(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener UpdateStatus : " + paid + "\n\n");


        

        // Sample Logic //
        FoodCooking.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PayCancled'")
    public void wheneverPayCancled_UpdateStatus(@Payload PayCancled payCancled){

        PayCancled event = payCancled;
        System.out.println("\n\n##### listener UpdateStatus : " + payCancled + "\n\n");


        

        // Sample Logic //
        FoodCooking.updateStatus(event);
        

        

    }

}


