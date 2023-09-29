package ra.bt.bt1;

public class Main {
    public static void main(String[] args) {
        MyClass my1 = new MyClass("Nam");
        System.out.println("Hiển thị tên: " + my1.getMyString());
        my1.setMyString("Minh");
        System.out.println("Tên thay đổi: " + my1.getMyString());
    }
}
