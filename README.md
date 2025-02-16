# Rent A Car Yönetim Sistemi

Bu proje, araç kiralama işlemlerini yönetmek için geliştirilmiş bir masaüstü uygulamasıdır.

## Sistem Mimarisi

```
+-------------------+     +-------------------+     +------------------+
|       Brand       |     |       Model      |     |        Car      |
+-------------------+     +-------------------+     +------------------+
| -id: int         |     | -id: int         |     | -id: int        |
| -name: String    |     | -brand_id: int   |     | -model_id: int  |
+-------------------+     | -name: String    |     | -plate: String  |
| +getById()       |     | -type: Type      |     | -color: Color   |
| +save()          |     | -year: String    |     | -km: int        |
| +update()        |     | -fuel: Fuel      |     +------------------+
| +delete()        |     | -gear: Gear      |     | +getById()      |
+-------------------+     +-------------------+     | +save()         |
         ^               | +getById()       |     | +update()       |
         |               | +save()          |     | +delete()       |
         |               | +update()        |     +------------------+
         |               | +delete()        |            ^
         |               +-------------------+            |
         |                        ^                      |
         |                        |                      |
         +------------------------+----------------------+
                                 |
                        +-------------------+
                        |       Book       |
                        +-------------------+
                        | -id: int         |
                        | -car_id: int     |
                        | -name: String    |
                        | -strt_date: Date |
                        | -fnsh_date: Date |
                        | -price: int      |
                        +-------------------+
                        | +save()          |
                        | +update()        |
                        | +delete()        |
                        +-------------------+
```

## Özellikler

- Marka ve model yönetimi
- Araç envanteri yönetimi  
- Araç kiralama işlemleri
- Rezervasyon takibi
- Filtreleme ve arama özellikleri

## Teknik Detaylar

### Kullanılan Teknolojiler

- Java
- Swing (GUI)
- PostgreSQL
- JDBC

### Veritabanı Yapısı

Sistem aşağıdaki ana tablolardan oluşmaktadır:

- brand (Marka bilgileri)
- model (Model bilgileri) 
- car (Araç bilgileri)
- book (Kiralama kayıtları)

### Katmanlı Mimari

Proje 4 ana katmandan oluşmaktadır:

- entity: Veri modelleri
- dao: Veritabanı işlemleri
- business: İş mantığı
- view: Kullanıcı arayüzü
- core: Yardımcı sınıflar ve veritabanı bağlantısı

## Kurulum

1. PostgreSQL veritabanını kurun
2. `rentacar` adında bir veritabanı oluşturun
3. Veritabanı bağlantı bilgilerini `src/core/Db.java` dosyasında güncelleyin
4. Projeyi derleyin ve çalıştırın

## Kullanım

1. Sisteme giriş yapın
2. Admin panelinden marka/model/araç yönetimini yapın
3. Araç kiralama işlemlerini gerçekleştirin
4. Raporları görüntüleyin

## Katkıda Bulunma

1. Bu depoyu fork edin
2. Yeni bir branch oluşturun (`git checkout -b feature/yeniOzellik`)
3. Değişikliklerinizi commit edin (`git commit -am 'Yeni özellik eklendi'`)
4. Branch'inizi push edin (`git push origin feature/yeniOzellik`)
5. Pull Request oluşturun

