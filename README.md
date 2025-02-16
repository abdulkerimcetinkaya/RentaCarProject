# Rent A Car Yönetim Sistemi

Bu proje, araç kiralama işlemlerini yönetmek için geliştirilmiş bir masaüstü uygulamasıdır.

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

