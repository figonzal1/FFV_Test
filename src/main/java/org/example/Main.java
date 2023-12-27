package org.example;


import com.neurotechnology.Nffv.Nffv;
import com.neurotechnology.Nffv.ScannerModule;

import java.util.Arrays;

public class Main {

    static {
        System.loadLibrary("Nffv");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");


        ScannerModule[] modules = Nffv.getAvailableScannerModules();

        for (ScannerModule module : modules) {
            System.out.println(module.getName());
        }


        if (modules != null) {
            Nffv engine = new Nffv("FingerprintDB.JavaSample.dat", "123456789", modules);
            engine.getEngineStatus();
        }else {
            System.out.println("Nulo");
        }
    }
}