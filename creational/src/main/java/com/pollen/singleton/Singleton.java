package com.pollen.singleton;

/* Singleton Class. */
public class Singleton {
  /* volatile - Indicates variable may get modified by multiple thread.
  */
  private static volatile Singleton INSTANCE;

  private static boolean initialized = false;

  /* Hiding constructor for re-initialization. */
  private Singleton() {}

  static {
    INSTANCE = new Singleton();
    INSTANCE.init();
    initialized = true;
  }

  private void init() {
    // Initialize the object.
  }

  public static synchronized Singleton getInstance() {
    if (initialized) {
      return INSTANCE;
    }

    return INSTANCE;
  }


}
