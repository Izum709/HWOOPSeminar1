package Animal;

public class Duck extends Animal{
    public Duck(String name, String color) {
        super(name, color);
    }

    public Duck() {
    }
    @Override
    public void getGo() {
        System.out.println(getName()+" Кормится в пруду");
    }

    @Override
    public void getVoice() {
        System.out.println(getClassName()+"kreeayk");
    }
}
