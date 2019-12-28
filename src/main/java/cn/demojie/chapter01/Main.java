package cn.demojie.chapter01;

import cn.demojie.chapter01.impl.MallardDuck;
import cn.demojie.chapter01.impl.RedheadDuck;

public class Main {
  public static void main(String[] args) {
    MallardDuck mallardDuck = new MallardDuck();
    mallardDuck.quack();
    mallardDuck.swim();
    mallardDuck.display();

    RedheadDuck redheadDuck = new RedheadDuck();
    redheadDuck.quack();
    redheadDuck.swim();
    redheadDuck.display();
  }
}
