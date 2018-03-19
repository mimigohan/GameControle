package Classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.apache.commons.io.FileUtils.writeByteArrayToFile;

/**
 * Created by peter on 3/17/2018.
 */
public class Game {
    int GameID;
    String Name,ProcessName,Path;
    Boolean Lock;

    public Game(int gameID, String name, String processName, String path) {
        GameID = gameID;
        Name = name;
        ProcessName = processName;
        Path = path;
        Lock=false;
    }

    public int getGameID() {
        return GameID;
    }

    public void setGameID(int gameID) {
        GameID = gameID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProcessName() {
        return ProcessName;
    }

    public void setProcessName(String processName) {
        ProcessName = processName;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public Boolean getLock() {
        return Lock;
    }

    public void setLock(Boolean lock) {
        Lock = lock;
    }
    public void LockUnlockGame() throws IOException {
        File exe = new File(this.Path);
        Path path= Paths.get(this.Path);
        byte[] data= Files.readAllBytes(path);
        writeByteArrayToFile(exe,reverse((data)));
       this.Lock=(!this.Lock);
    }

    public static byte[] reverse(byte[] in) {
        int begin = 0,count=0;
        int end = in.length - 1;
        byte temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
            count++;
        }
        System.out.print(count);
        return in;
    }
}
