# RPName API

---

##  подключение 

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.Limitely</groupId>
        <artifactId>rpname-api</artifactId>
        <version>1.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

---

## plugin.yml

```yaml
softdepend: [RPName]
```

---

## использование

```java
RegisteredServiceProvider<RoleplayNameProvider> rsp =
    getServer().getServicesManager().getRegistration(RoleplayNameProvider.class);

if (rsp == null) return; // не установлен

RoleplayNameProvider api = rsp.getProvider();

// онлайн игрок 
RoleplayPassport passport = api.getPassport(player.getUniqueId());

// любой игрок
api.getPassportAsync(uuid, passport -> {
    if (passport == null) return;

    String fullName = passport.fullName(); // Василий Пупкин
    String faction  = passport.faction();  // Гражданский
});
```

---

## доступные данные

| Метод | Описание |
|------|--------|
| name() | Имя |
| surname() | Фамилия |
| fullName() | Имя + фамилия |
| age() | Возраст |
| gender() | Пол |
| faction() | Фракция |
| rank() | Ранг / должность |
| registerDate() | Дата регистрации |

---
