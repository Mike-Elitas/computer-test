class Software{
    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareRamMemoryRequirement;

    //Builder
    public Software(){}

    //Getters
    public String getSoftwareName() {
        return softwareName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public int getSoftwareSpaceRequirement() {
        return softwareSpaceRequirement;
    }

    public int getSoftwareRamMemoryRequirement() {
        return softwareRamMemoryRequirement;
    }

    //Setters
    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public void setSoftwareSpaceRequirement(int softwareSpaceRequirement) {
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }

    public void setSoftwareRamMemoryRequirement(int softwareRamMemoryRequirement) {
        this.softwareRamMemoryRequirement = softwareRamMemoryRequirement;
    }
}

class OperatingSystem{
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private int osRamMemmoryRequirement;
    private int[] osSoftware;

    //Builder
    public OperatingSystem(){}

    //Getters
    public String getOsName() {
        return osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public int getOsSpaceRequirement() {
        return osSpaceRequirement;
    }

    public int getOsRamMemmoryRequirement() {
        return osRamMemmoryRequirement;
    }

    public int[] getOsSoftware() {
        return osSoftware;
    }

    //Setters
    public void setOsName(String osName) {
        this.osName = osName;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public void setOsRamMemmoryRequirement(int osRamMemmoryRequirement) {
        this.osRamMemmoryRequirement = osRamMemmoryRequirement;
    }

    public void setOsSoftware(int[] osSoftware) {
        this.osSoftware = osSoftware;
    }
}

public class Computer {
    private String name;
    private int ramMemory;
    private int hardDisk;
    private OperatingSystem os;

    //Builder
    public Computer(){}

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
}


