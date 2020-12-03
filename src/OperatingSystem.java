public class OperatingSystem {
        private String osName;
        private String osVersion;
        private String osArchitecture;
        private boolean osOnlyCommand;
        private int osSpaceRequirement;
        private int osRamMemmoryRequirement;
        private Software[] osSoftware;

        //Builder
        public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamMemmoryRequirement) {
            this.osName = osName;
            this.osVersion = osVersion;
            this.osArchitecture = osArchitecture;
            this.osOnlyCommand = osOnlyCommand;
            this.osSpaceRequirement = osSpaceRequirement;
            this.osRamMemmoryRequirement = osRamMemmoryRequirement;
        }

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

        public Software[] getOsSoftware() {
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

        public void setOsSoftware(Software[] osSoftware) {
            this.osSoftware = osSoftware;
        }
    }
