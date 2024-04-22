
#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.
  @US003
  Feature: US003 Amazon Testi
    Background:
      Given kullanici amazon sayfasina gider
    @iphone
    Scenario: TC01 arama kutusunda iphone aratilir

      When arama kutsunda iphone aratir
      And sayfayi kapatir

      @samsung
      Scenario: TC02 arama kutusunda samsung aratilir

        When arama kutsunda samsung aratir
        And sayfayi kapatir

        @nokia
        Scenario: TC03 arama kutusunda nokia aratilir

          When arama kutsunda nokia aratir
          And sayfayi kapatir

          #Feature file da kullanacagimiz senaryolarda baslangic icin ortak adimlar varsa
          #background keywordu kullanarak ortak adimlari belirtebiliriz, @BeforeEach mantigi ile calisir