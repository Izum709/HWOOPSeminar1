package Animal;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat() {
    }

    @Override
    public void getGo() {
        System.out.println(getName()+" Ушел на ночную мышиную охоту");
    }

    @Override
    public void getFly() {
    }

    @Override
    public void getSwim() {
    }

    @Override
    public void getVoice() {
        System.out.println(getClassName()+"meew");
    }
}
