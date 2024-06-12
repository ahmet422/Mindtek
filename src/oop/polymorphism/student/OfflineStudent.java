package oop.polymorphism.student;

public class OfflineStudent implements Student {
    @Override
    public String study() {
        return "Offline student is studying from class.";
    }
}
