package Animal;

public class Shark extends Animal {
    public Shark(String name, String color) {
        super(name, color);
    }

    public Shark() {
    }

    @Override
    public void getGo() {

    }

    @Override
    public void getFly() {

    }

    @Override
    public void getSwim() {
        System.out.println(getClassName()+"Охотится в море");
    }

    @Override
    public void getVoice() {

    }
}
