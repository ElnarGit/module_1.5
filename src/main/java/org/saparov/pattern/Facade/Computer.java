package org.saparov.pattern.Facade;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hardDrive = new HardDrive();
    }

    public void start(){
        System.out.println("Запуск компьютера...");
        cpu.start();
        ram.load();
        hardDrive.read();
        System.out.println("Компьютер запущен и готов к работе.");
    }

    public void shutdown(){
        System.out.println("Выключение компьютера...");
        cpu.shutdown();
        ram.clear();
        hardDrive.write();
        System.out.println("Компьютер выключен.");
    }
}
