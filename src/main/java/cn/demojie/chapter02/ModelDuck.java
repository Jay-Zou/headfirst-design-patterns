package cn.demojie.chapter02;

import cn.demojie.chapter02.fly.FlyNoWay;
import cn.demojie.chapter02.fly.FlyWithWings;
import cn.demojie.chapter02.quack.Quack;

/**
 * 模型鸭
 */
public class ModelDuck extends Duck {

  public ModelDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}
