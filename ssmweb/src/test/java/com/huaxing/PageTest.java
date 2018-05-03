package com.huaxing;

public class PageTest {

    public static void main(String[] args) {


        int curPage = 2;
        int pageSize = 20;
        int count = 0;
        for(int tempCount = (curPage - 1) * pageSize; count <= tempCount; tempCount = (curPage - 1) * pageSize)
            curPage--;


        System.out.println(curPage);
    }
}
