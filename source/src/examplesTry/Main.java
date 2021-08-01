package examplesTry;

class Main {
    public static void main(String[] args) {
        int roll = 1;
        char grade = 'A';
        double GPA = 4.5;
        String fName = "Anand";
        String lName = "Sharma";

        System.out.println("Roll number : "+roll+" is having grade " +grade);
        System.out.println(GPA);
        System.out.println("First Name : "+fName);
        System.out.println("Last Name : "+lName);

        char initialFirst = fName.charAt(0);
        char initialSecond = lName.charAt(0);
        System.out.println("Students initials are " +initialFirst+"."+initialSecond+".");




    }
}