class T1 {
    protected void print() {
        System.out.println("from t1");
    }

}

class T2 extends T1 {

    @Override
    protected void print() {
        // TODO Auto-generated method stub

        System.out.println("from t2");
    }
}

public class UE {

    public static void main(String[] args) {
        T2 t = new T2();
        t.print();
        T1 t2 = new T2();
        t2.print();
    }
}