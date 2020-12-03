public class Software {
    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareRamMemoryRequirement;

    //Builder
    public Software(String softwareName, String softwareVersion, int softwareSpaceRequirement, int softwareRamMemoryRequirement) {
        this.softwareName = softwareName;
        this.softwareVersion = softwareVersion;
        this.softwareSpaceRequirement = softwareSpaceRequirement;
        this.softwareRamMemoryRequirement = softwareRamMemoryRequirement;
    }

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
