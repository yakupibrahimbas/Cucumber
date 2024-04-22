
  @US012
  Feature: US012 BlueRentalCar sayfasinda Login islemi
    Scenario: TC01 Exceldeki Email ve Password bilgileri ile login olunur
      Given kullanici blueRentalCar sayfasina gider
      When login butonuna tiklar
      And kullanici 2 saniye bekler
      And exceldeki "admin_info" sayfasindaki kullanici bilgileri ile login olur
      And sayfayi kapatir
