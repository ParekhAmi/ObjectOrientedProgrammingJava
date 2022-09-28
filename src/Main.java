import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void addRandomNumber(ArrayList<Integer> list) {
        Random random = new Random();
        int a = random.nextInt(1000);

        list.add(a);
    }

    public static void main(String[] args) throws IOException {

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

        ArrayList<Integer> arrayRandom = new ArrayList<>(7);
        arrayRandom.add(1);
        arrayRandom.add(2);
        addRandomNumber(arrayRandom);
        System.out.println(arrayRandom);

        // ----------------------------Contact Class------------------------------------

        Contact contactOne = new Contact("Josh", new PhoneNumber("2643214531"), "josh123@gmail.com");

        Contact contactTwo = new Contact("Salena", new PhoneNumber(1, "4431457658"));

        Contact contactThree = new Contact("Smith", "smith54@yahoo.com");

        Contact contactFour = new Contact("Monika", new PhoneNumber("4387689876"), "monika74@gmail.com");

        System.out.println("----------------Contact Class------------------");
        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);

        // -----------------------Digits only filereader Class-------------------------------

        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");

        System.out.println("------------------Digits only filereader Class---------------------");
        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());

        // -------------3 AccountTransfer, MissedPayment, PasswordChange Class------------

        PasswordChangeEvent eventOne = new PasswordChangeEvent("1234567");
        MissedPaymentEvent eventTwo = new MissedPaymentEvent("5433487");
        AccountTransferEvent eventThree = new AccountTransferEvent("7645342");

        System.out.println("----------AccountTransfer, MissedPayment, PasswordChange Class------");

        Event[] events = { eventOne, eventTwo, eventThree };

        for (Event e : events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
