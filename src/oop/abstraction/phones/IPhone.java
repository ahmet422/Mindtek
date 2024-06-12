package oop.abstraction.phones;

public class IPhone extends Phone {
    @Override
    public String takePhoto() {
        return "iPhone is taking photo";
    }

    @Override
    public String call() {
        return "iPhone is calling";
    }

    @Override
    public String text() {
        return "iPhone is texting";
    }

    @Override
    public String upload() {
        return "iPhone is uploading to memory";
    }
}
