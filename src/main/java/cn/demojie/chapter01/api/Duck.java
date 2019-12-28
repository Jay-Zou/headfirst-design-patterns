package cn.demojie.chapter01.api;

public abstract class Duck {
  public void quack() {
    System.out.println("quack");
  }

  public void swim() {
    System.out.println("swim");
  }

  public abstract void display();
}
