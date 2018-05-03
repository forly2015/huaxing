package com.huaxing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 我们知道我们要使用lambda表达式，都要有一个函数式接口和它对应，那是不是我们要使用的时候，都要自己定义接口呢？

 其实java已经给我们提供了部分接口。这些接口在java.util.function的包里面。
 *
 *  1.功能型接口   即接受参数也提供返回值  Function<P,T>

 2.供给型接口   不接受参数但是有返回值  Supplier<T>

 3.断言式接口   主要用于判断          Predicate<P>

 4.消费型接口   接受参数没有返回值     Sonsumer<P>
 */

public class lambdaTest {
    public static void main(String[] args) {

        // 测试功能型
        // 平方
        Integer aInteger = new Integer(12);
        String string = "outerline";
        Function<Integer, Integer> function = a -> {
            return a * a;
        };
        System.out.println("功能型接口  :" + function.apply(aInteger));
        // 测试供给型接口
        // 生成一个随机数
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(45);
        };
        System.out.println("供给型接口  " + supplier.get());
        // 断言式接口
        // 判断一个数是否大于0
        Predicate<Integer> predicate = a -> {
            return a > 0;
        };
        System.out.println("断言式接口  " + predicate.test(18));
        // 消费性接口
        // 输出输入的参数
        Consumer<String> consumer = a -> {
            System.out.println("消费性接口内部  " + a.length() + "  " + string);
        };
        System.out.println("调用消费性接口");
        consumer.accept("xiaofeixingjiekoucanshu");

        List<String> list = new ArrayList<>();
        list.stream().filter((String s) -> {
            return s.length() < 10;
        }).map(str -> str.length()).forEach(str2 -> System.out.println(str2));


    }

    public void print() {
        Consumer<String> consumer = str -> {
            System.out.println(str + "  " + this);
        };
        Consumer<String> consumer2 = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t + "  " + this);
            }

            @Override
            public String toString() {
                return "inner class ";
            }
        };

        consumer.accept("lambda");
        consumer2.accept("anonymous Class");
    }

    @Override
    public String toString() {
        return "outter class ";
    }
}