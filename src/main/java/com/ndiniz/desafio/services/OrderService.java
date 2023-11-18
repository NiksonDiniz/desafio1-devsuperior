package com.ndiniz.desafio.services;

import com.ndiniz.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
   @Autowired
   private ShippingService shippingService;

   public double total(Order order) {
      double discount = order.getDiscount() / 100.0;
      double totalDiscount = order.getBasic() - (order.getBasic() * discount);
      return totalDiscount + shippingService.shipment(order);
   }

}
