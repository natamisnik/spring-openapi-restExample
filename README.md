# spring-openapi-restExample

Пример создания серверного Rest приложения с помощью генерации через Open-Api:

-Создаем openapi спецификацию в виде yaml файла. При создании может помочь онлайн редактор https://editor.swagger.io/.
Можно посмотреть какие то специфичные вещи для генераторов https://openapi-generator.tech/docs/generators/spring/.
-Добавляем openapi-generator-maven-plugin плагин в pom файл. Этот генератор будет генерить API, Dto на основе описанного шагом выше yaml файла.
Определяем набор параметров который нужен
-Добавляем необходимые зависимости в проект. (springdoc-openapi-ui, jackson-databind-nullable, spring-boot-starter-validation)
-Генерим код с помощью openapi-generator-maven-plugin плагина.
Реализуем сгенерированные API.
