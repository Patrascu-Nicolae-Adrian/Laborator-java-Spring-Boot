
class Main {
    public static void main(String args[]) {
        Counter counter1 = new Counter(0, 500);
        Counter counter2 = new Counter(500, 1000);
        Suma sumaThread1 = new Suma(counter1);
        Suma sumaThread2 = new Suma(counter2);
        sumaThread1.run();
        sumaThread2.run();
        try{
            sumaThread1.join();
            sumaThread2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        int sumaTotala = sumaThread1.getSuma() + sumaThread2.getSuma();
        System.out.println("suma totala:" + sumaTotala);
        System.out.println("prima suma :" + sumaThread1.getSuma());
        System.out.println("a doua suma:" + sumaThread2.getSuma());



    }
}