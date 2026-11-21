# Sprint 02 - Tools and Patterns

Java 21, Maven, без зависимостей

## 01. Принципы разработки - `_1_principles`

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

## 02. SOLID - `_2_solid`

| Пакет | О чём |
|---|---|
| `srp` | `UserManager` "на все руки" -> бизнес-логика, два репозитория (поиск / изменение), уведомления и `UserOrchestrator` |
| `ocp.price` | Цепочка `instanceof` по типам товаров -> интерфейс `Item`. Новый `GiftCard` без правки калькулятора |
| `ocp.shape` | `switch` по названию фигуры -> интерфейс `Shape`. Новый `Polygon` без правки `ShapeCalculator` |
| `lsp.delivery` | Проверка `instanceof FreeDeliveryService` в клиенте -> `isEligibleForDelivery` в контракте |
| `lsp.account` | `FixedDepositAccount` бросает исключение в `withdraw` -> отдельный интерфейс `Withdrawable` |
| `lsp.bird` | Пингвин, который "летает" с исключением -> `Bird.move()` + интерфейс `Flying` |
| `isp.atm` | Общий `ATMOperations` -> клиентский и админский интерфейсы, стаб для тестов |
| `isp.printer` | МФУ-интерфейс с заглушками у простого принтера -> `Printer`, `DocumentScanner`, `Fax` |
| `dip` | `new EmailSender()` внутри сервиса и Service Locator -> внедрение через конструктор (и через сеттер для сравнения) |
