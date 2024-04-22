Feature: US009 Google Testi

  Scenario: TC01 Google sayfasinda arama yapilir

    Given kullanici "https://google.com" sayfasina gider
    When kullanici verilen bilgilerle arama yapar
      | volvo |
      | auidi |
      | tofas |
    And sayfayi kapatir

    #DataTAbles ile Scenario outlinedan farkli olarak her stepten sonra tablo olusturabiliriz.