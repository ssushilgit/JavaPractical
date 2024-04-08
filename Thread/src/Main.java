class A extends Thread{
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Hi from A "+i);
        }
        try {
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Error detected");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Hi from B "+i);
        }
        try {
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Error detected");
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {

        A objA = new A();
        B objB = new B();
        objA.start();
        objB.start();
    }
}