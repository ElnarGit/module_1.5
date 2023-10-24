package org.saparov.pattern.Proxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("Image1");
        image1.display();
        
        System.out.println();
        
        // это изображение взято из кэша
        image1.display();
    }
}
