package de.generics;

import java.util.ArrayList;
import java.util.List;

public class UnlimitedParameterPolymorph {

  private List<?> list;

  public void addDoubleValue(double doubleValue) {

    list = new ArrayList<Double>();

    ((List<Double>) list).add(doubleValue);
  }

  public void addNumberValue(Number numberValue) {

    list = new ArrayList<Number>();

    ((List<Number>) list).add(numberValue);
  }

  public List<?> getList() {
    return list;
  }
}
