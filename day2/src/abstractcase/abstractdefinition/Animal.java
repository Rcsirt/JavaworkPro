package abstractcase.abstractdefinition;
//父类 动物类
public abstract class Animal {
    private String name;
    public abstract void cry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
