package cn.demojie.chapter02.fly;

import cn.demojie.chapter02.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    // 实现鸭子飞行
    System.out.println("I'm flying!!");
  }
}
