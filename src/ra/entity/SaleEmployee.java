package ra.entity;

public class SaleEmployee extends Employee {
    private String language;

    public SaleEmployee(int id, String name, int age, String language) {
        super(id, name, age);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("sale man");
    }
    public void sale() {
        System.out.println("Đang bán hàng");
    }

}

