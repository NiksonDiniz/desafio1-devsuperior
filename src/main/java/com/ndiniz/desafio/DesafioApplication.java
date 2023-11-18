package com.ndiniz.desafio;


import com.ndiniz.desafio.entities.Order;
import com.ndiniz.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

   @Autowired
   private OrderService orderService;

   public static void main(String[] args) {
      SpringApplication.run(DesafioApplication.class, args);
   }

   @Override
   public void run(String... args) throws Exception {
      Order order1 = new Order(1034, 150.0, 20.0);
      Order order2 = new Order(2282, 800.0, 10.0);
      Order order3 = new Order(1309, 95.90, 0.0);

      double result1 = orderService.total(order1);
      double result2 = orderService.total(order2);
      double result3 = orderService.total(order3);

      System.out.println("\n--- Pedido 01 ---");
      System.out.println("Pedido código " + order1.getCode());
      System.out.printf("Valor total: R$ %.2f%n", result1);

      System.out.println("\n--- Pedido 02 ---");
      System.out.println("Pedido código " + order2.getCode());
      System.out.printf("Valor total: R$ %.2f%n", result2);

      System.out.println("\n--- Pedido 03 ---");
      System.out.println("Pedido código " + order3.getCode());
      System.out.printf("Valor total: R$ %.2f%n", result3);
   }
}
