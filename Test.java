public class Test {
    int id;
    Test(int id) {
        this.id = id;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + id + " destroyed");
    }

    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(2);
        t1 = null;
        t2 = null;
        System.gc();  
    }
}
