package org.example;

import java.util.Scanner;

public class calculator implements cal{

    @Override
    public int tal1() {
        Scanner sca = new Scanner(System.in);
        String tal2String = sca.nextLine(); // holds actual input
        int tal1Int = Integer.parseInt(tal2String);
        return tal1Int;

    }

    @Override
    public int tal2() {
        Scanner sca = new Scanner(System.in);
        String tal2String = sca.nextLine(); // holds actual input
        int tal2Int = Integer.parseInt(tal2String);
        return tal2Int;
    }

    @Override
    public int calculate() {
        return 0;
    }
}
