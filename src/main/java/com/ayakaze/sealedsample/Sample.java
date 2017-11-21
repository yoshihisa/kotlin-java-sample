package com.ayakaze.sealedsample;

import com.ayakaze.sealedsample.utils.RandomColorGenerator;

public class Sample {
    public static void main(String[] args) {
        System.out.println("めいん");
        RandomColorGenerator generator = new RandomColorGenerator();
        Color color = generator.generate();
        if(color instanceof Color.Red) {
            System.out.println("赤色");
        } else if(color instanceof  Color.Green) {
            System.out.println("青色");
        } else if(color instanceof Color.Blue) {
            System.out.println("緑色");
        } else if(color instanceof EmeraldGreen) {
            System.out.println("エメラルドグリーン");
            System.out.println(((EmeraldGreen) color).getColorCode());
        } else if(color instanceof Color.Custom) {
            System.out.println("カスタマイズされた色");
            System.out.println(((Color.Custom) color).getColorCode());
        } else if(color instanceof ExtendedColor) {
            System.out.println("やばいやつ");
            System.out.println(((ExtendedColor) color).getColorCode());
        }
    }
}
