Feature: Accedo y logueo a TickTick

  Scenario: Usuario loguea a la aplicacion Tick Tick
    Given Accedo a la pagina de ticktick y abro el formulario de login
    And Lleno el  formulario usando el <"usuario"> y la <"Contraseña"> y me logueo.
    When I search for "Cheese!"
    Then the page title should start with "cheese"