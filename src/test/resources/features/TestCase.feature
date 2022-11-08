Feature: Trenyol.com uzerinden sepete ürün eklenmesi

  @Regression
  Scenario Outline: Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
    * Cerezler kabul edilir
    * Kullanici ana sayfayi ziyaret eder
    * Kullanici kelimesini aratir "<text>"
    * Kullanici urunleri secer
    * Kullanici iki farkli magazadan urun ekler
    * Secilen urunun dogru olarak eklendigi sepetim sayfasında dogrulanır
    * Secilen Urunler silinir

    Examples: secilecek urun
      | text    |
      | SAMSUNG |

  @Regression
  Scenario Outline: Kullanici girisi yapılarak sepete ürün eklenmesi
    * Cerezler kabul edilir
    * Kullanici ana sayfayi ziyaret eder
    * Kullanici kimlik bilgileriyle oturum açar
    * Kullanici girisi ana sayfada dogrulanir
    * Kullanici kelimesini aratir "<text>"
    * Kullanici urunleri secer
    * Kullanici iki farkli magazadan urun ekler
    * Secilen urunun dogru olarak eklendigi sepetim sayfasında dogrulanır
    * Secilen Urunler silinir
    Examples: secilecek urun
      | text    |
      | IPHONE  |