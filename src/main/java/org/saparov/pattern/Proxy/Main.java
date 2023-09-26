package org.saparov.pattern.Proxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("Image1");
        Image image2 = new ImageProxy("Image2");

        image1.display();
        image2.display();
        
        System.out.println();
        
        // эти изображения взяты из кэша
        image1.display();
        image2.display();

    }
}
