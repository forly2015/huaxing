package com.huaxing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiTest {

    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();

        names.add("zhangsan1");
        names.add("zhangsan22");
        names.add("zhangsan333");
        names.add("zhangsan33");
        names.add("zhangsan4444");
        names.add("zhangsan55555");
        names.add("zhangsan3");

        List<String> name2s  = new ArrayList<>();
        name2s.add("lisi1");
        name2s.add("lisi2");
        name2s.add("lisi3");



        //获取stream 遍历集合
        names.stream().forEach(name -> System.out.println(name));


        System.out.println("==============过滤并输出====================");

        //过滤并且遍历
        Stream<String> namesStream = names.stream();

        namesStream.filter(name -> name.equals("zhangsan3"))
                .forEach(name -> System.out.println(name));


        System.out.println("==============去重====================");
        names.stream().distinct().forEach(name -> System.out.println(name));


        /**
         * 默认有一定的规则排序
         */
        System.out.println("==============排序====================");
        names.stream().sorted((name1,name2) ->name1.length()-name2.length())
                .forEach(name -> System.out.println(name));


        /**
         * 作用是返回一个对当前所有元素执行执行mapper之后的结果组成的Stream。直观的说，就是对每个元素按照某种操作进行转换，转换前后            *  Stream中元素的个数不会改变，但元素的类型取决于转换之后的类型。
         */
        System.out.println("==============使用map方法转大写====================");
        names.stream().map(name ->name.toUpperCase())
                .forEach(name -> System.out.println(name));

        /**
         * 使用flatMap()将连个集合平摊
         */
        System.out.println("==================平摊之后=========================");
        Stream<List<String>> names1 = Stream.of(names, name2s);
        names1.forEach(name -> System.out.println(name));


    }
}
