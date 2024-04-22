@US004
Feature: US004 Amazon Testi

  Background:
    Given kullanici "https://amazon.com" sayfasina gider

  @iphone
  Scenario: TC01 arama kutusunda iphone aratilir
    When arama kutusunda "iphone" aratilir
    And sayfayi kapatir

  Scenario: TC02 arama kutusunda nokia aratilir
    When arama kutusunda "nokia" aratilir
    And sayfayi kapatir


  Scenario: TC03 arama kutusunda samsung aratilir
    When arama kutusunda "samsung" aratilir
    And sayfayi kapatir



#    Feature file i daha dynamic hale getirebilmek icin gitmek istedigimiz url i yada aratmak istedigimiz
#  bir ifdaye "cift tirnak" icinde belirtebiliriz, Bunu yaptigimizda tirnak icinde belirttigimiz ifade
#  stepDefinition classindaki method icin artik bir parametreye donusur boylece tekrar tekar method olusturmadan
#  istedigimiz url e gidebilir veya istedigimiz kelimeyi aratabiliriz