import java.awt.print.Pageable;

public abstract class Student implements Categorizable {  //Attributes
    private String name;
    private int age;

    public Student(String name, int age)  //No Argument constructors
    {
       this.name = "unknown";
       this.age = 0;
    }
    public Student(){     //multiple Argument constructors
        this.name= name;
        this.age = age;
    }

    public void setName(String name) {   //mutator
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){        //Accessor
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){           //toString
        return ("Name" + getName() +
                "\nAge" + getAge());
    }
    
}
