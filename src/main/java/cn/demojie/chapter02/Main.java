package cn.demojie.chapter02;

import cn.demojie.chapter02.fly.FlyRocketPowered;

public class Main {
  public static void main(String[] args) {
    modelTest();
  }

  private static void mallardTest() {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
  }

  private static void modelTest() {
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
