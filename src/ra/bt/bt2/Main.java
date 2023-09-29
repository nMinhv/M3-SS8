package ra.bt.bt2;

public class Main {
    public static void main(String[] args) {
        double circleArea1 = StaticMethod.calCircleArea(3.5);
        System.out.println("Diện tích hình tròn (bán kính 3.5) :" + circleArea1);
        double circleArea2 = StaticMethod.calCircleArea(6);
        System.out.println("Diện tích hình tròn (bán kính 6) :" + circleArea2);

        double calRectangleArea1 = StaticMethod.calRectangleArea(2.5, 6);
        System.out.println("Diện Tích hình chữ nhật :" +calRectangleArea1);
        double calRectangleArea2 = StaticMethod.calRectangleArea(4,7);
        System.out.println("Diện tích hình chữ nhật :" +calRectangleArea2);

        double calTriangleArea1 = StaticMethod.calTriangleArea(3,4,5);
        System.out.println("Diện tích tam giác :" + calTriangleArea1);
        double calTriangleArea2 = StaticMethod.calTriangleArea(4.5,7,6);
        System.out.println("Diện tích tam giác :" +calTriangleArea2);
    }
}
