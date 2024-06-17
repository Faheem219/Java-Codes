package OOP;

public class pojoExampleStudent {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public pojoExampleStudent(String id, String name, String dateOfBirth, String classList){
        this.id=id;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.classList=classList;
    }

    @Override
    public String toString(){
        return "Student{"+"id='"+id+"\'"+", name='"+name+"\'"+", dateOfBirth='"+dateOfBirth+"\'"+", classList='"+classList+"\'"+"}";
    }

    public String getClassList() {
        return classList;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
