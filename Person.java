public class Person {
    private String name;
    private int age;
    public void setName(String name){
        this.name= name;

    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Person obj1=new Person();
        obj1.setName("xyz");
        obj1.setAge(40);
        System.out.println(obj1.getName());
    }
}
