package cn.demojie.chapter02.quack;

public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    // 橡皮鸭子吱吱叫
    System.out.println("Squeak");
  }
}
