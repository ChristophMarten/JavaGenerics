package de.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generics {

  private List<String> stringListe = List.of("Oma ", "Opa ", "Baby");


  public String getValues() {
    StringBuilder values = new StringBuilder();

    stringListe.forEach(sL -> values.append(sL));
    return values.toString();
  }
}
