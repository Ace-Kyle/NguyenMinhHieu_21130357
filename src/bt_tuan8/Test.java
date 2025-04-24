package bt_tuan8;

class Test {
    public static void main(String[] args) {
        CD cd1 = new CD(101, "Leave your lover",    "Sam Smith", 12, 15);
        CD cd2 = new CD(102, "Fire on Fire",        "Sam Smith", 10, 9);
        CD cd3 = new CD(103, "Too good at goodbye", "Sam Smith", 12, 7);
        CD cd4 = new CD(104, "Diamond",             "Sam Smith", 16, 15);
        CD cd5 = new CD(105, "Dance with a Stranger","Sam Smith", 12, 15);
        CD cd6 = new CD(106, "Stiches",             "Shawn Mendes", 17, 20);
        CD cd7 = new CD(107, "Hello",               "Adele", 9, 15);
        CD cd8 = new CD(108, "Swings",              "Birdy", 8, 10);
        CD cd9 = new CD(109, "Persona",             "The Vamps", 5, 15);
        CD cd10 = new CD(110, "Kungfu Fighting",    "The Vamps", 14, 15);

        CDManager manager = new CDManager();
        manager.addCD(cd1);
        manager.addCD(cd2);
        manager.addCD(cd3);
        manager.addCD(cd4);
        manager.addCD(cd5);

        manager.addCD(cd6);
        manager.addCD(cd6); //duplicate id - for test

        manager.addCD(cd7);
        manager.addCD(cd8);
        manager.addCD(cd9);
        manager.addCD(cd10);

        System.out.println("Compute total number of CD: " + manager.computeNumberOfCD());
        System.out.println("Compute total price: " + manager.totalPrice());
        System.out.println("========List CD - before sort ========");
        manager.printAll();

        System.out.println("========List CD - after sort [Price] ========");
        manager.sortByPrice();
        manager.printAll();

        System.out.println("========List CD - after sort [Title] ========");
        manager.sortByPrice();
        manager.printAll();




    }
}
