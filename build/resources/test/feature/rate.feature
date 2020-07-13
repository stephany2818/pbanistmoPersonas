#Actor: juaceved - Stephany Acevedo - 13/07/2020
Feature: Open the pdf file of Deposit Account Fees
  I as a client of Banistmo
  I want to be able to access the Banistmo People page
  To validate the Deposit Account Rates pdf

  Scenario Outline: Correctly display Deposit Account Rates pdf
    When <Actor> is on the People Banismto Page you select the <Option>
    Then you will see the pdf of <FileName>

    Examples:
      |Actor   |Option          |FileName                                    |
      |Rafael  |Tarifario       |Tarifas de Cuentas de Depositos             |