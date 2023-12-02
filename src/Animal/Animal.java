package Animal;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"\nИмя = " + name  +
                "\nЦвет = " + color;
    }
    public String getClassName(){
        return (getClass().getSimpleName()+" "+getName()+" ");
    }
    public void getGo(){
         System.out.println(getClassName()+"Вышел на охоту");
    }
    public void getFly(){
        System.out.println(getClassName()+"Улетел на зимовку");
    }

    public void getSwim(){
        System.out.println(getClassName()+"Плавает в пруду");
    }

    public void getVoice(){
        System.out.println(getClassName()+"wooow");
    }
}
