package controller;

import com.huangdeyi.distributed.orderservice.OrderService;
import com.huangdeyi.distributed.orderservice.OrderServiceRequest;
import com.huangdeyi.distributed.orderservice.OrderServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class OrderCenterController {

    @Autowired
    private OrderService orderService;

    //下单接口
    @RequestMapping("placeOrder")
    @ResponseBody
    public OrderServiceResponse placeOrder(){
        OrderServiceRequest request = new OrderServiceRequest();
        request.setParams("下单了！宝贝");
        OrderServiceResponse response = orderService.placeOrder(request);
        return response;
    }



}
