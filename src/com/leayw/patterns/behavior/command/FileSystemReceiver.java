package com.leayw.patterns.behavior.command;

public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}
