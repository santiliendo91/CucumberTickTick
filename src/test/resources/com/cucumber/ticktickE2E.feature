Feature: Crea, edita y elimina una lista

  Scenario: Me logueo con mi usuario y creo, edito y elimino una Lista
    Given Accedo al home page de  TickTick y me logueo al mismo
    And Creo y guardo lista
    Then reviso que se creó correctamente la lista
    And Edito y guardo una lista existente
    Then reviso que se editó correctamente la lista
    And Elimino la lista editada
    Then reviso que se eliminó correctamente la lista
