package javaStudy;


public class MathExam {
    public static void main(String[] args) {
        //Math 클래스는 생성자가 private 이라서 new 연산자로 객체 생성 생성불가
        int value1 = Math.max(5, 30);
        System.out.println(value1);

        int value2 = Math.min(5, 30);
        System.out.println(value2);
        System.out.println(Math.abs(-10));
        System.out.println(Math.random());



    }
}
