//import java.math.*;
class Car{
            private int maxSpeed;
            private int licensedSpeed;
        
            public Car(int maxSpeed, int licensedSpeed) {
                this.maxSpeed = maxSpeed;
                this.licensedSpeed = licensedSpeed;
            }
        
            public int getMaxSpeed() {
                return maxSpeed;
            }
        
            public void setMaxSpeed(int maxSpeed) {
                this.maxSpeed = maxSpeed;
            }
        
            public int getLicensedSpeed() {
                return licensedSpeed;
            }
        
            public int setLicensedSpeed(int licensedSpeed) {
                return this.licensedSpeed = licensedSpeed;
            }
        }
public class Sund {
    public static void main(String[] args) {
        
        Car exam=new Car(120,100);
        System.out.println(exam.getMaxSpeed());
        System.out.println(exam.getLicensedSpeed());
        System.out.println(exam.setLicensedSpeed(85));
        
        
        
    double radius = 10.0,pi=3.142;
    double area = (int)(pi* radius * radius);
    double circumference = 2.0 * pi* radius;
    System.out.println("The area is: " + area);
    System.out.println("The circumference is: " + circumference);
    }
    
}




