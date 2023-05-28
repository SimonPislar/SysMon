package org.example;

import SystemData.*;

public class Main {
    public static void main(String[] args) {
        CPUData cpuData = new CPUData();
        System.out.println("CPU Name: " + cpuData.getCPUName());
        System.out.println("CPU Temperature: " + cpuData.getCPUTemperature());
        System.out.println("CPU Usage: " + cpuData.getCPUUsage());
        System.out.println("CPU Core Count: " + cpuData.getCPUCoreCount());
        System.out.println("CPU Thread Count: " + cpuData.getCPUThreadCount());
        System.out.println("CPU Architecture: " + cpuData.getCPUArchitecture());
        System.out.println("CPU Manufacturer: " + cpuData.getCPUManufacturer());
    }
}