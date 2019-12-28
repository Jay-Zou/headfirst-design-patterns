package cn.demojie.chapter02.quack;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    // 实现鸭子呱呱叫
    System.out.println("Quack");
  }
}
