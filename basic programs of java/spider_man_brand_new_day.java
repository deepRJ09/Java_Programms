class SpiderMan {
    protected String name;

    SpiderMan(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println(this.name + " is ready to protect New York.");
    }

    public void usePower() {
        System.out.println(this.name + " uses spider-sense and web shooters.");
    }
}

class PeterParker extends SpiderMan {
    private int webCartridges;

    PeterParker(String name, int webCartridges) {
        super(name);
        this.webCartridges = webCartridges;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(this.name + " says: With great power comes great responsibility.");
    }

    @Override
    public void usePower() {
        this.webCartridges--;
        System.out.println(this.name + " swings into the Brand New Day with "
                + this.webCartridges + " web cartridges left.");
    }
}

class MilesMorales extends SpiderMan {
    MilesMorales(String name) {
        super(name);
    }

    @Override
    public void usePower() {
        System.out.println(this.name + " uses camouflage and venom blast to stop trouble.");
    }
}

public class spider_man_brand_new_day {
    public static void main(String[] args) {
        SpiderMan spiderMan;

        spiderMan = new PeterParker("Peter Parker", 5);
        spiderMan.introduce();
        spiderMan.usePower();

        System.out.println();

        spiderMan = new MilesMorales("Miles Morales");
        spiderMan.introduce();
        spiderMan.usePower();
    }
}