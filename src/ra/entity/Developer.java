package ra.entity;

public class Developer extends Employee{
    private String programingLanguage;

    public Developer() {

    }

    public Developer(int id, String name, int age, String programingLanguage) {
        super(id, name, age);
        this.programingLanguage = programingLanguage;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("sale man");
    }

    public  void fixBug() {
        System.out.println("Đang fix bug");
    }
}
