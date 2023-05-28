package SystemData;

import com.profesorfalken.wmi4java.*;

public class CPUData {

    private final WMI4Java wmi4Java;

    public CPUData() {
        this.wmi4Java = WMI4Java.get();
    }

    public String getCPUTemperature() {
        return this.wmi4Java.getWMIObject("Win32_PerfFormattedData_Counters_ThermalZoneInformation").get("CurrentTemperature");
    }

    public String getCPUName() {
        return this.wmi4Java.getWMIObject("Win32_Processor").get("Name");
    }

    public String getCPUUsage() {
        return this.wmi4Java.getWMIObject("Win32_PerfFormattedData_PerfOS_Processor").get("PercentProcessorTime");
    }

    public String getCPUCoreCount() {
        return this.wmi4Java.getWMIObject("Win32_Processor").get("NumberOfCores");
    }

    public String getCPUThreadCount() {
        return this.wmi4Java.getWMIObject("Win32_Processor").get("ThreadCount");
    }

    public String getCPUArchitecture() {
        return this.wmi4Java.getWMIObject("Win32_Processor").get("Architecture");
    }

    public String getCPUManufacturer() {
        return this.wmi4Java.getWMIObject("Win32_Processor").get("Manufacturer");
    }


}
