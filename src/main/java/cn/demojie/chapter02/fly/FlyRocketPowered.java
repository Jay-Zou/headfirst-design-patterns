package cn.demojie.chapter02.fly;

public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    // 实现鸭子飞行
    System.out.println("I'm flying with a rocket!");
  }
}
