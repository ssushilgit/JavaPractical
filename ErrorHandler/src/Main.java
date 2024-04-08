class ErrorHandler{
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            int result = i/j;
            int arr[] = {1,3,4,5};
            System.out.println(arr[99]);
        }catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Error Detected");
        }
        catch (ArrayIndexOutofBounds e){
            System.out.println("Array is out of bound");
        }
        catch (Exception e){
            System.out.println("Some other Error Detected");
        }finally {
            System.out.println("Program exited");
        }
    }
}
 