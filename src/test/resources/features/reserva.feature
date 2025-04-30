Feature: Reserva de carro por aplicativo

  Scenario: Reserva dentro da área de cobertura
    Given que o passageiro está em "Belo Horizonte"
    When ele solicita um carro para o endereço "Rua A, 123"
    Then o sistema deve retornar "Motorista a caminho"

  Scenario: Reserva fora da área de cobertura
    Given que o passageiro está em "Betim"
    When ele solicita um carro para o endereço "Rua B, 456"
    Then o sistema deve retornar "Área fora de cobertura"

