package javaUtil.exam;

public class BoxExam {




    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();


        box.setObj("hello");

        box.getObj(); // return 오브젝트타입으로 반환
        String str = (String) box.getObj();
        System.out.println(str);

        box.setObj(1);
        int value = (int)box.getObj();

    }
}
