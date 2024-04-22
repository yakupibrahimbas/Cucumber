@US002
Feature: US002 BlueRentalCar Sayfasinda Login Testi

  Scenario: TC01 Verilen Email ve Password ile login olunur

    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur
    And sayfayi kapatir
