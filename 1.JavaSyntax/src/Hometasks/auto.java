package Hometasks;

public class auto {
    public static void main(String[] args) {
        //Auto moe = new Auto();
        //moe.obemdvig = 1.6;
        //moe.loshsila = 160;
        //moe.marka = "lada";
        //moe.model = "vesta";
        //moe.odometr = 100000;
        //moe.skorost = 80;
        Voditel owner = new Voditel();
        owner.familiya = "Sabirova";
        owner.imya = "Julia";
        owner.model = "vesta";




    }
     static class car {
         public double obemdvig;
         public int loshsila;
         public String marka;
         public String model;
         public int odometr;
         public int skorost;
    }
     static class Voditel {
        public String imya;
        public String familiya;
        public String model;
    }
}
