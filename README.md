# Logging Spring Boot Starter

Описание:
Spring Boot Starter, который предоставляет возможность логировать HTTP запросы в приложении на базе Spring Boot.

1. Для того чтобы внедрить стартер в приложение на базе Spring Boot необходимо добавить зависимость в pom файл
   <dependency>
   <groupId>com.nataly</groupId>
   <artifactId>loggingspringbootstarter</artifactId>
   <version>0.0.1-SNAPSHOT</version>
   </dependency>
2. В application установить значение app.starter.logging.enabled = true для включения логирования
3. Запустить приложение.
4. Выполнить HTTP запрос.
5. В консоли отобразятся логи с информацией о типе запроса, URL, статус ответа.
6. Чтобы отключить логтрование необходимо установить значение app.starter.logging.enabled = false.



