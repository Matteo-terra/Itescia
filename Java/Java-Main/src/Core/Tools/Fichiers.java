package Core.Tools;

import Core.Others.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Fichiers {
    
    private String defaultPath = "src/file.txt";
    private String contentFile = "";
    
    public Fichiers(){
        init();
    }
    
    public Fichiers(String defaultPath){
        this.defaultPath = defaultPath;
        this.contentFile = "";
        init();
    }
    
    public String getPathDefault() { return this.defaultPath; }
    public String getContentFile() { return this.contentFile; }
    
    public void setPathDefault(String defaultPath) { this.defaultPath = defaultPath; }
    public void setContentFile(String contentFile) { this.contentFile = contentFile; }
    
    private void init(){
        readFile();
    }
    
    private void readFile(){
        if(defaultPath!=null){
            try {
                int x = 0;
                File file = new File(this.defaultPath);
                Scanner readFile = new Scanner(file);
                while (readFile.hasNextLine()) {
                    String data = readFile.nextLine();
                    this.contentFile += x<=0 ? data : "\n"+data;
                    x++;
                }
                readFile.close();
            } catch (FileNotFoundException e) {
                Console.print("An error occurred.");
                e.printStackTrace();
            }
        } else { Console.print("defaultPath : "+defaultPath+"\nPlease configure this with setPathDefault(String defaultPath)."); }
    }
    
}