package cn.demojie.chapter02.quack;

public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    // 什么都不做，不会叫
    System.out.println("<< Silence>>");
  }
}
