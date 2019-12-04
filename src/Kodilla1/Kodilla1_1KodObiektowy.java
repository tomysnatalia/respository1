package Kodilla1;

class UserParameters {


    public void parametersAgeAndHeight (double age, double height) {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }

    public boolean parameterName (String name) {
        if (name != null) {
            return true;
        } else {
            System.out.println("Can not find User");
            return false;
        }
    }
}


 class App {

    public static void main (String [] args) {

        String name = "Adam";
        double age = 40.5;
        double height = 178;

        UserParameters Adam = new UserParameters();


        boolean parameterName = Adam.parameterName(name);
        if (parameterName) {
            Adam.parametersAgeAndHeight(age, height);
        }
    }
}

