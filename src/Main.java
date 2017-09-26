public class Main {
//Opgave 9.1
//Mads Nielsen

        public static void main(String[] args) {

            //Her bruger jeg Class, der bliver lavet nedeunder
            Rectangle square1 = new Rectangle();
            System.out.println("The area of the square is : " + square1.getArea());

            Rectangle square2 = new Rectangle(4,40);
            System.out.println("The area of the square is : " + square2.getArea());

            Rectangle square3 = new Rectangle(3.5,35.9);
            System.out.println("The area of the square is : " + square3.getArea());
        }
    }


    class Rectangle {
        double width;
        double height;

        //giver "standart"værdierne
        Rectangle() {height = 1; width=1; }

        //Tillader bruger at skrive værdier ind i funktionen/classen
        Rectangle(double newRadius, double newHeight) {
            height = newHeight;
            width = newRadius;
        }

        //laver en get, der udregner areal..
        double getArea() {
            return height * width;
        }


    }


