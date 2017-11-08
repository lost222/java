//实现克隆必须要implement cloneable接口（其实接口里面什么都没有，就是形式）
//最终都要体现在object的clone上。
//由于重写object的克隆，返回值一定是object（形式上）
//默认浅拷贝


class Student1 implements Cloneable {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int in) {
        number = in;
    }

    @Override
    public Object clone() {            //因为要保持方法重写,不得不返回一个object,导致每次调用的时候都必须向下转换
                                      //不保持方法重写行不行?行,关键object的clone是native(不是Java)的,比自己实现的快很多
                                        //所以方法实现中的stu非得是students是检查的意思,这里return的时候自动做了一次向上转换
        Student1 stu = null;
        try {
            stu = (Student1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //System.out.println(stu.getClass());
        return stu;
    }
    public static void  Teststudent1() {
        Student1 a = new Student1();
        a.setNumber(2);
        System.out.println(a.clone().getClass());
        Student1 b = (Student1)a.clone();            //为什么得转换
        System.out.println(b.getNumber());
    }
}



