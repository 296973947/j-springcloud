package cn.jorian.framework.jcloudsonsumer1.entiy;

public class User {
   private int id;
   private String  name;
   private Double money;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User(int id, String name, Double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
}
