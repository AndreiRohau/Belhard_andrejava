package els3.logging_research.tiny_changes;

import java.util.logging.Logger;

public class OrderLogic {

        // Инициализация логера
        private static final Logger log = Logger.getLogger(String.valueOf(OrderLogic.class));

        public void doOrder(){
            // какае-то логика
            String n = "Заказ оформлен!";
            // логируем инфо
            log.info(n);
            addToCart();
        }

        private void addToCart() {
            // добавление товара в корзину
            String n = "Товар добавлен в корзину!";
            // логируем ошибку
            log.info(n);


    }
}
