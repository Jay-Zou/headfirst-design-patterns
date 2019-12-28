package cn.demojie.chapter02;

import cn.demojie.chapter02.fly.FlyBehavior;
import cn.demojie.chapter02.quack.QuackBehavior;

public abstract class Duck {
  /** 声明成接口类型，作用域为protected或者package-private */
  protected FlyBehavior flyBehavior;

  protected QuackBehavior quackBehavior;

  public abstract void display();

  public void performFly() {
    // 委托给其他行为类，Delegate
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("Duck swim");
  }

  /** 动态设定行为 */
  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
