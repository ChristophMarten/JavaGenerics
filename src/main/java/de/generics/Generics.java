package de.generics;

import java.util.List;

public class Generics {

  private List<String> stringListe = List.of("Oma ", "Opa ", "Baby");


  public String getValues() {
    StringBuilder values = new StringBuilder();

    stringListe.forEach(sL -> values.append(sL));
    return values.toString();
  }
}
