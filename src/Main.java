public class Main {

    public static void main(String[] args) {


        class Bike {

                public void Accelerate(){
                    System.out.println("The Bike Moves Front  ");

                };

                public void GearUp(){
                    System.out.println("The Bike Gear Up The Bike Goes In First Gear ");
                }
                public void GearDown(){
                System.out.println("The Bike Gear Down Now The Bike Goes Without Gear ");
            }
                public void key() {
                    System.out.println("The Bike Machine Turned On");
                }
                public void Key_Removed() {
                    System.out.println("The Bike Machine Turned Off");
                }
                public void Brake(){
                    System.out.println("Now The Bike Stopped");

                };
                public void Steering_Right() {
                    System.out.println("The Bike Turned Right");
                }
                public void Steering_Left(){
                    System.out.println("The Bike Turned Left");

                }

                public void Move_forward() {
                    System.out.println("The Bike Goes Front");
                }
                public void Move_Backward(){
                    System.out.println("The Bike Goes Back");
                };

            }
            Bike Rx100=new Bike();
            Rx100.key();
            Rx100.Accelerate();
            Rx100.GearUp();
            Rx100.GearDown();
            Rx100.Steering_Right();
            Rx100.Steering_Left();
            Rx100.Brake();
            Rx100.Key_Removed();


        }
    }





