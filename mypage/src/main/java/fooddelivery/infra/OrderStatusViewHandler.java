package fooddelivery.infra;

import fooddelivery.domain.*;
import fooddelivery.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderStatusViewHandler {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            OrderStatus orderStatus = new OrderStatus();
            // view 객체에 이벤트의 Value 를 set 함
            orderStatus.setOrderId(orderPlaced.getId());
            orderStatus.setStatus("주문요청됨");
            // view 레파지 토리에 save
            orderStatusRepository.save(orderStatus);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderCancled_then_UPDATE_1(@Payload OrderCancled orderCancled) {
        try {
            if (!orderCancled.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(orderCancled.getId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("주문취소요청됨");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaid_then_UPDATE_2(@Payload Paid paid) {
        try {
            if (!paid.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(paid.getOrderId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("결제완료됨");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPayCancled_then_UPDATE_3(@Payload PayCancled payCancled) {
        try {
            if (!payCancled.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(payCancled.getOrderId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("결제취소완료됨");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderAccepted_then_UPDATE_4(@Payload OrderAccepted orderAccepted) {
        try {
            if (!orderAccepted.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(orderAccepted.getOrderId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("주문승인됨");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderRejected_then_UPDATE_5(@Payload OrderRejected orderRejected) {
        try {
            if (!orderRejected.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(orderRejected.getOrderId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("주문거절됨");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCookStarted_then_UPDATE_6(@Payload CookStarted cookStarted) {
        try {
            if (!cookStarted.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(cookStarted.getOrderId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("음식조리중");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCookFinished_then_UPDATE_7(@Payload CookFinished cookFinished) {
        try {
            if (!cookFinished.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(cookFinished.getOrderId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("음식조리완료");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPicked_then_UPDATE_8(@Payload Picked picked) {
        try {
            if (!picked.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(picked.getOrderId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("배달중");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenDelivered_then_UPDATE_9(@Payload Delivered delivered) {
        try {
            if (!delivered.validate()) return;
                // view 객체 조회

                List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(delivered.getOrderId());
                for(OrderStatus orderStatus : orderStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    orderStatus.setStatus("배달완료됨");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenDelivered_then_DELETE_1(@Payload Delivered delivered) {
        try {
            if (!delivered.validate()) return;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

