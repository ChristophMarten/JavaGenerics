package de.generics;

import java.util.ArrayList;
import java.util.List;

public class KontravarianzCollection {

  // Eine Liste<Number> wäre zuweisungskompatibel zu einer Liste<Double>.
  private List<? super Double> list;

  public void addDoubleValue(double doubleValue) {
    // Compiler Fehler
    //list = new ArrayList<Integer>();

    list = new ArrayList<Double>();

    (list).add(doubleValue);
  }

  public void addNumberValue(Number numberValue) {

    list = new ArrayList<Number>();

    ((List<Number>) list).add(numberValue);
  }

  public void addLongValue(long longValue) {

    list = new ArrayList<Number>();

    ((List<Number>) list).add(longValue);
  }

  public List<? super Double> getList() {
    return list;
  }

}
