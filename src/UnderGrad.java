import javax.swing.*;

public class UnderGrad extends Student {
    private String subjects ["Maths, English ,sport science, Bilogy Agric,web Dev,OOP Software,Eng,Server Script"];
    private String category;

    public UnderGrad(String name,int age){
            setAge(age);
            setName(name);
    }
    public void setSubjects(String subjects){
        this.subjects = subjects;
    }
    public void setCategory(String category){
        this.category=category;
    }
    private String getSubject() {
        return subjects;
    }
    private String getCategory() {
        return category;
    }
    public String toString(){
        return JOptionPane.showMessageDialog("Name:" + ("David Clifford")+
                "Subject" +("Maths,Sport Science") +
                "\ncategory" + ("Full time")
                   "\nAge" + ("20"))
                   "\n"
                  "\n"
        "Name:" + ("Louise Buckley")+
                "\nAge" + ("23")+
                "\nSubject"+("Web Dev, OOP, Software Eng")+
                "\nCategory"+("Full time"));

    }

}
