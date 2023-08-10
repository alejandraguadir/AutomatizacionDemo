Feature: programar reunion
  Yo como usuario del serenity demo
  Quiero crear una unidad de negocio
  Para poder programar una reunion

  @ProgramarReunion
  Scenario:  programar reunion a unidad de negocio
    Given el usuario inicio sesion
    When el usuario crea la unidad de negocio
    And el usuario programa la reunion
    Then la reunion se programara exitosamente

  @ProgramarReunion2
  Scenario: Programar reunión exitosa
    Given el administrador inicia sesion
      | admin | password |
      | admin | serenity |
    When el administrador crea la unidad de negocio
      | nombreUnidad | unidadPrincipal |
      | unidad two   | Branding        |
    And el administrador programa la reunion
      | nombreReunion      | tipoReunion | numeroReunion | ubicacionReunion | unidadReunion | organizadorReunion | reporteroReunion |
      | Planeacion mensual | Team Weekly | R_12          | HQ-01            | unidad two    | Sara Torres       | James Jones      |
    Then la reunion se programara de manera exitosa



