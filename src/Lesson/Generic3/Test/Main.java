package Lesson.Generic3.Test;

public class Main {
    public static void main(String[] args) {
        DriveV3 driveV3 = new DriveV3(100);
        DriveV6 driveV6 = new DriveV6(200);
        DriveV8 driveV8 = new DriveV8(500);


        Auto<? super DriveV6> auto;

      //  Auto<DriveV3> toyota = new Toyota(driveV3);
//        Auto<DriveV6> suzuki = new Suzuki(driveV6);
//        Auto<DriveV8> kia = new Kia(driveV8);
        //auto = toyota;
//        auto = kia;
//        auto = suzuki;



    }
}
