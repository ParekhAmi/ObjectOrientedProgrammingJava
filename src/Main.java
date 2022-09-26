import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // -------------------------Tree Class--------------------------

        System.out.println("--------------Tree Class----------------------------");

        Tree trOak = new Tree(120, 5, TreeType.OAK);

        trOak.announceTallTree();

        Tree trMaple = new Tree(80, 30, TreeType.MAPLE);

        trMaple.announceTallTree();

        // -----setter method
        trMaple.grow();

        // -------setter method
        trMaple.setTreeDiameterInches(trMaple.getTreeDiameterInches() + 2);

        // -----getter method
        System.out.println("Mapletree Height: " + trMaple.getHeight() + "-- MapletreeInches: "
                + trMaple.getTreeDiameterInches() + "-- Tree Type : " + trMaple.getTreeType());

        // -------------------------Employee Class---------------------------------

        ExcerciseEmployee emp1 = new ExcerciseEmployee("Ami", 29, "Northyork", 2000);

        ExcerciseEmployee emp2 = new ExcerciseEmployee("Mitul", 32, "Montreal", 100000);
        emp2.raiseSalary();

        System.out.println("----------------Employee Class------------------");
        System.out.println(emp1.salary);
        System.out.println(emp2.salary);

        // ----------------------------Bank Account Class-----------------------------

        ExcerciseBankAccount bankAcc = new ExcerciseBankAccount("Scotiabank", 20000000);

        bankAcc.getOwner();
        bankAcc.withdraw(2000);

        System.out.println("----------------Bank Account Class------------------");
        System.out.println("Balance after withdrawl: " + Math.round(bankAcc.getBalance()));

        bankAcc.deposit(3000);
        System.out.println("Balance after deposit: " + Math.round(bankAcc.getBalance()));

        // ----------------------------Mod ArrayList Class-----------------------------
        ExcerciseModArrayList<Integer> modlist = new ExcerciseModArrayList<>();
        modlist.add(0);
        modlist.add(10);
        modlist.add(20);
        modlist.add(30);

        System.out.println("----------------Mod Arraylist Class------------------");
        System.out.println(modlist.getUsingMod(1));
        System.out.println(modlist.getUsingMod(-2));
        System.out.println(modlist.getUsingMod(40));

        // ----------------------------Odd ArrayList Class-----------------------------
        OddArrayList oddArrayList = new OddArrayList(1, 2, 3, 4, 7, 9, -13);

        System.out.println("----------------Odd Arraylist Class------------------");
        System.out.println(oddArrayList);

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(-13);

        System.out.println(arrayList);
    }
}
