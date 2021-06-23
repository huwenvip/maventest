/**
 * @author Hu Wen
 * @version 1.0
 * @date 2021/6/19 10:42
 */
public class Test {
    public static void main(String [] args){
        Test t= new Test();
        t.age(33);
    }
    public  void age(int age){
    if (age <0){
        System.out.println("不可能");
    }else {
        System.out.println("你太老了");
    }
    }
}
