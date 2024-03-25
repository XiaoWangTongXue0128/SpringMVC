package domain;

public class GirlFirend {
    private String name;
    private Integer age;

    public GirlFirend(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public GirlFirend() {
    }

    @Override
    public String toString() {
        return "GirlFirend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
