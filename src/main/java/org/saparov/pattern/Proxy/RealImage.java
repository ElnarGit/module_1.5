package org.saparov.pattern.Proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Загрузка изображения " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения: " + fileName);
    }
}
