package OOP;

public class Woman extends People implements Run{
    private String work;
    public String school;

    public Woman(String school) {
        this.school = school;
    }

    public Woman() {
    }

    @Override
    public void run() {

    }
}

