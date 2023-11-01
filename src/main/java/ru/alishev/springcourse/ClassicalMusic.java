package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Doing my init");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruc");
    }

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
}
