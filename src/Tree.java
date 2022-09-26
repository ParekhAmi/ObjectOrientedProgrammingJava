import java.awt.Color;

public class Tree {

    private double height;
    private double treeDiameterInches;
    private TreeType treeType;

    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double h, double d, TreeType t) {
        this.height = h;
        this.treeDiameterInches = d;
        this.treeType = t;
    }

    public double getHeight() {
        return height;
    }

    public double setHeight(double height) {
        return this.height = height;
    }

    public double getTreeDiameterInches() {
        return treeDiameterInches;
    }

    public void setTreeDiameterInches(double treeDiameterInches) {
        this.treeDiameterInches = treeDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void grow() {
        this.height = this.height + 10;
        this.treeDiameterInches = this.treeDiameterInches + 1;
    }

    public void announceTallTree() {
        if (this.height > 100) {
            System.out.println("It's Tall " + this.treeType + " tree!");
        }
    }

    public static void announceTree() {
        System.out.println("Lookout for that " + TRUNK_COLOR + "tree.");
    }

}
