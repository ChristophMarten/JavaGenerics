package de.generics;

import java.util.ArrayList;
import java.util.List;

public class KovariantCollection {

  // Aus T extends V folgt: GenerischerTyp<T> extends GenerischerTyp<V>
  // T heißt upper typebound, also der allgemeinste Typparameter, der erlaubt ist.
  private List<? extends Number> list;

  public void addDoubleValue(double doubleValue) {

    list = new ArrayList<Double>();

    ((List<Double>) list).add(doubleValue);
  }

  public void addLongValue(long longValue) {

    list = new ArrayList<Long>();

    ((List<Long>) list).add(longValue);
  }

  public void addIntegerValue(Object integerObjectValue) {

    list = new ArrayList<Integer>();

    // Typfehler vom Compiler
    //((List<Integer>) list).set(1, integerValue);

    int intValue = (int) integerObjectValue;

    // Autoboxing
    ((List<Integer>) list).add(intValue);

  }

  public List<? extends Number> getList() {
    return list;
  }

}
