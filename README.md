# Java 19 Grubu - Java SE Ders Örnekleri

Vektörel eğitimindeki "Java 19" grubunda derste yazılan Java SE örnekleri: nesne yönelimli programlamanın
temelleri, koleksiyonlar, dosya işlemleri, iş parçacıkları, Swing arayüzleri, JDBC ve Maven'a giriş.

> **Not:** Bu depo 2017 yılında eğitim amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları eskidir ve
> bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

| Klasör | Ne var |
|---|---|
| `FirstProject` | Derslerin büyük kısmı (aşağıya bakın) |
| `Matematik` | Toplama ve çıkarma sınıfları; başka projeden bağımlılık olarak kullanılan küçük Maven modülü |
| `Islem` | `Matematik` modülünü Maven bağımlılığı olarak kullanan örnek |
| `maven` | `mvn archetype` ile oluşturulmuş basit Maven projesi |
| `MavenDeneme` | `maven` projesini bağımlılık olarak kullanan örnek |
| `Sekil` | Tek sınıflık Maven örneği |

`FirstProject/src` içindeki paketler:

- `com.vektorel.*`: sınıf ve nesne, kurucular, kapsülleme (setter/getter), kalıtım (`kalitim`, `kalitim2`, `kalitim3`),
  çok biçimlilik (`poly`, `arraypoly`), aşırı yükleme, soyut sınıf ve arayüzler, hata yakalama ve özel
  istisnalar (`hatalar`, `myex`, `benimhatam`), dosya okuma/yazma ve stream örnekleri
- `com.vektorel2.*`: enum, generic, koleksiyonlar (list, set, map, queue, vector, properties), thread
- `com.swingvektorel.*`: Swing ile pencere, layout, olay (action) ve dosya seçici örnekleri, basit giriş ekranı
- `com.jdbc.*`: PostgreSQL'e JDBC ile bağlanma, `PreparedStatement` ile kullanıcı girişi, hastane tablosu örnekleri

## Teknolojiler

- Java 8 (pom dosyalarındaki derleyici ayarı)
- Maven, `maven-compiler-plugin` 3.5.1
- PostgreSQL JDBC sürücüsü (`FirstProject`: 42.2.28, `maven`: 9.1-901-1.jdbc4), JUnit 3.8.1

## Çalıştırma

1. Projeleri Eclipse'e "Existing Maven Projects" olarak içe aktarın (her klasörde ayrı `pom.xml` var).
2. Örnekler ayrı `main` metotlarıyla çalışır; ilgili paketteki `Islem` ya da benzeri sınıfı çalıştırmanız yeterli.
3. `Islem` ve `MavenDeneme` başka modüllere bağlıdır; önce `Matematik` ve `maven` klasörlerinde `mvn install` çalıştırın.
4. JDBC örnekleri için yerelde bir PostgreSQL veritabanı gerekir. Bağlantı bilgileri `com/jdbc/*/ConnectionEnum.java`
   dosyalarındadır; veritabanı adı, kullanıcı ve `SIFRE_KALDIRILDI` yazan şifre alanını kendi değerlerinizle
   doldurun. Örneklerin beklediği tablolar (`login`, `hastane`, `doktor`, `hemsire` vb.) depoda yoktur, elle
   oluşturmanız gerekir.
