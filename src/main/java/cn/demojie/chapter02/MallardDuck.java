package cn.demojie.chapter02;

import cn.demojie.chapter02.fly.FlyWithWings;
import cn.demojie.chapter02.quack.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    // 实例化具体的实现类，并赋值给父类的成员
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
