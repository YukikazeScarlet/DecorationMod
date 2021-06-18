package com.github.yukikazescarlet.decorationmod.modelLoader;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class ObjModelLoader {

    ObjModelStruct struct = new ObjModelStruct();
    String location = "src\\main\\resources\\assets\\decorationmod\\models\\";
    BufferedReader bufferedReader;
    String line;
    String str ="";
    StringTokenizer token;
    int i = 0;

    public ObjModelLoader(String fileName){
        location+=fileName;
    }

    public ObjModelStruct openFile(){
        Path path = Paths.get("../"+location);
        File file = new File(String.valueOf(path.toAbsolutePath()));
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(bufferedReader.toString());
        writeArray();
        return struct;
    }

    private void writeArray(){
        while(canReadLine()){
            token = new StringTokenizer(line," /",false);
            while (token.hasMoreTokens()){
                String value = token.nextToken();
                switch (value){
                    case "g":
                        if(i>0)struct.hashMap.putIfAbsent(str+"End",i);
                        str = getValS();
                        struct.hashMap.putIfAbsent(str,i);
                        break;
                    case "v":
                        for(int j=0;j<3;j++) struct.v.add(getValD());
                        break;
                    case "vt":
                        for(int j=0;j<2;j++) struct.vt.add(getValD());
                        break;
                    case "vn":
                        for(int j=0;j<3;j++) struct.vn.add(getValF());
                        break;
                    case "f":
                        for(int j=0;j<3;j++){
                            struct.xv.add(getValI());
                            struct.xvt.add(getValI());
                            struct.xvn.add(getValI());
                            i++;
                        }
                        break;
                    default:
                }
            }
        }
        struct.hashMap.putIfAbsent(str+"End",i);
    }

    private boolean canReadLine(){
        try {
            line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line != null;
    }

    private String getValS(){
        return (token.nextToken());
    }
    private double getValD(){
        return Double.parseDouble(token.nextToken());
    }
    private float getValF(){
        return Float.parseFloat(token.nextToken());
    }
    private int getValI(){
        return Integer.parseInt(token.nextToken());
    }
}
