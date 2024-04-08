class Emp {
    int eid;
    int salary;
    static public String ceo;

    public Emp(){
        this.eid = 1000;
        this.salary = 20000;
        this.ceo = "Ram";
        System.out.println("Const called");
    }

    static {
        ceo = "Ram";
        System.out.println("Static called");
    }
    public void show(){
        System.out.println("Employee id = "+eid+" CEO is " + ceo);
    }

    public static void main(String[] args) {
        Emp rb = new Emp();

        try {
            rb.salary = 20000;
        }
        catch (Exception e)
        {
            System.out.println("Exception encountered");
        }

        rb.show();
    /*
    rb.eid = 1000;
    Emp.eid = 1;
    rb.salary = 100000;
    Emp.ceo = "Deena";
    */
        Emp jn = new Emp();
  /*
    jn.eid = 1300;
    jn.salary = 100000;
    */
        jn.show();
    }
}
 