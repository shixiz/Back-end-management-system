package shop.domain;

public class Count {
    private String name;
    private int value;
    private String icon;
    private String color;

    public Count(String name, int value, String icon, String color) {
        this.name = name;
        this.value = value;
        this.icon = icon;
        this.color = color;
    }

    public Count() {
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getIcon() {
        return icon;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Count{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", icon='" + icon + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
