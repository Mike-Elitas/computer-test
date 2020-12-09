public class Computer {
    private String name;
    private int ramMemory;
    private int hardDisk;
    private OperatingSystem os;

    //Builder
    public Computer(String name, int ramMemory, int hardDisk, OperatingSystem os) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
        this.os = os;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public OperatingSystem getOs() {
        return os;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    //Methods

    public void install(OperatingSystem os){
        if (this.os!=null && hardDisk>os.getOsSpaceRequirement() && ramMemory>os.getOsRamMemmoryRequirement()) {
            hardDisk -= os.getOsSpaceRequirement();
            ramMemory-= os.getOsRamMemmoryRequirement();
        }
        else
        {
            System.out.println("No hay espacio en el disco o suficiente memoria RAM");
        }
    }

    public static void main(String[] args) {
        OperatingSystem os1=new OperatingSystem("Windows", "7.2", "RISC",true , 100, 1024, 0);
        Computer c1=new Computer("Carlos", 2048, 500, os1);
        c1.install(os1);
        System.out.println(c1.hardDisk + " " + c1.ramMemory);
        Software sw1=new Software("Paint", "1.0", 10, 20);
        os1.installSoftware( sw1=new Software("Paint", "1.0", 10, 20),c1 );
    }
}


