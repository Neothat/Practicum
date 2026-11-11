# Sprint 02 - Tools and Patterns

Java 21, Maven, без зависимостей

## 01. Принципы разработки - `principles`

Где есть сравнение, лежат два варианта: `bad` (нарушение) и `good` (исправлено)

| Пакет | О чём                                                                               |
|---|-------------------------------------------------------------------------------------|
| `intro.prototype` | Прототип: копия объекта через `copy()`, без знания реализации                       |
| `intro.facade` | Фасад `UserNotifier` сам выбирает канал (email / sms / push)                        |
| `intro.antipattern` | God Object (`UserManager`) и hard code -> конфиг в `principles.properties`          |
| `yagni` | Пустой `UserNotificationService` "на будущее". Поле `active`, которое всегда `true` |
| `dry` | Шаблон даты вынесен в `OrderDateFormatter`. общая проверка строк через `Validation` |
| `kiss` | Логгер + форматтер + интерфейсы ради одного `println`. Упрощённый `getFirst`        |
| `bduf` | План (в `package-info.java`) -> реализация выдачи книг строго по нему                |
| `occam` | Запрос пользователя по id на чистом JDBC вместо Hibernate / Spring Data             |
