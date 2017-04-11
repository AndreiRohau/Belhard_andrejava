package els3.loggingResearch.logging;

import java.util.logging.Logger;

public class OrderLogic {

        // Инициализация логера
        private static final Logger log = Logger.getLogger(String.valueOf(OrderLogic.class));

        public void doOrder(){
            // какае-то логика
            System.out.println("Заказ оформлен!");
            // логируем инфо
            log.info("Это информационное сообщение!");
            addToCart();
        }

        private void addToCart() {
            // добавление товара в корзину
            System.out.println("Товар добавлен в корзину");
            // логируем ошибку
            log.info("Это сообщение ошибки");


    }
}
