public class index {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Incognito mode initializing.");
        System.out.print("Progress: [#");
        for(int i=0;i<100;i++){ 
        System.out.print("#");
        Thread.sleep(50);
        }
        System.out.print("#]");


    }
}