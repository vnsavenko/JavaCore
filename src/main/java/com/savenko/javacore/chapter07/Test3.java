package com.savenko.javacore.chapter07;
// Объекты передаются по ссылке на них
public class Test3 {
    int a, b;

    public Test3(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // передать объект в метод
    void meth(Test3 o){
        o.a *=2;
        o.b /=2;
    }
}

class PassObjRe{
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
