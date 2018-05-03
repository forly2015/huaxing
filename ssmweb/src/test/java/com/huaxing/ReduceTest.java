package com.huaxing;

import org.springframework.util.StopWatch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReduceTest {


    public static void main(String[] args) {
        StopWatch sw = new StopWatch();

        sw.start("查询巴士线路");
        List<Bus> list = new ArrayList<>();

        list.add(new Bus(new BigDecimal(3)));
        list.add(new Bus(new BigDecimal(4)));
        list.add(new Bus(new BigDecimal(5)));
        list.add(new Bus(new BigDecimal(6)));
        list.add(new Bus(null));


        System.out.println(list.stream().filter(bus -> bus.getMoney()!= null).map(Bus::getMoney).reduce(BigDecimal.ZERO,BigDecimal::add));

        //list.stream().filter(bus -> bus.getMoney()!= null).map(Bus::getMoney).reduce(BigDecimal.ZERO,BigDecimal::add);
        sw.stop();
        System.out.println(sw.prettyPrint());

    }


    static class Bus{

        private BigDecimal money;

        public Bus(){
        }

        public Bus(BigDecimal money){
            this.money = money;
        }

        public BigDecimal getMoney() {
            return money;
        }

        public void setMoney(BigDecimal money) {
            this.money = money;
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "money=" + money +
                    '}';
        }
    }


}
