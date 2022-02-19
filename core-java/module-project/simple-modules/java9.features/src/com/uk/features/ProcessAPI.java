package com.uk.features;

import java.util.stream.Stream;

public class ProcessAPI {
    public static void main(String[] args) throws InterruptedException {
        /*Returns a ProcessHandle for the current process. The ProcessHandle cannot be used to destroy the current process, use System.exit instead.*/
        ProcessHandle processHandle = ProcessHandle.current();
        System.out.println("Current process Id:" + processHandle.pid());
        // Thread.sleep(3000);
        Stream<ProcessHandle> processHandles = ProcessHandle.allProcesses();
        processHandles.forEach(ph -> {
            System.out.println("Process Id:" + ph.pid());
        });
    }
}
