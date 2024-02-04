package test;

 public class Car{
   private int year;
   private int speed;

   public int getYear(){
      return year;
   }

     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public void setYear(int newYear){
       year=newYear;
   }
   public void accelerate(){
        speed+=10;
        System.out.println(speed);
    }
    public void brack(){
        speed-=10;
        System.out.println(speed);
    }

    public  Car(int carSpeed, int carYear){
        speed=carSpeed;
        year=carYear;
    }
}
