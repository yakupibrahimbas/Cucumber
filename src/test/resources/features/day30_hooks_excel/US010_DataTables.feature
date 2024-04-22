@US010
Feature: US010 BlueRentalCar sayfasinda Login islemi
  Scenario: TC01 Verilen Email ve Password bilgileri ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    But kullanici 2 saniye bekler
    And verilen kullanici bilgileri ile login olur
      | email                         | password |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |
    And sayfayi kapatir

  Scenario: TC02 Verilen Email ve Password bilgileri ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    But kullanici 2 saniye bekler
    And verilen kullanici bilgileri ile login olur ikinci yol
      | email                         | password |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |
    And sayfayi kapatir