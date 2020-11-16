package cn.javareview.ssm.test;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

import cn.javareview.ssm.util.ZipCompressorByAnt;

public class TestZip {
    public static void main(String[] args) {
    	//to desktop of user computer
    	FileSystemView fsv=FileSystemView.getFileSystemView();
    	File file=fsv.getHomeDirectory();
    	String toPath = file.getPath()+"/test.zip";
    	System.out.println(file.getPath());
        ZipCompressorByAnt zca = new ZipCompressorByAnt(toPath);
        zca.compressExe("G:\\test");
    }
}