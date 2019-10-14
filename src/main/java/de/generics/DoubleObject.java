package de.generics;

public class DoubleObject<T,S> {

  private T object1;
  private S object2;

  public DoubleObject(T object1, S object2) {
    this.object1 = object1;
    this.object2 = object2;
  }

  public String toString() {
    return this.object1.getClass() + " " + this.object1 + ", " + this.object2.getClass() + " "
        + this.object2;
  }

}