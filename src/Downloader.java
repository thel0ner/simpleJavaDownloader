import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Downloader {
    public static boolean isNetAvailable(){
        try {
            final URL url = new URL("https://google.com");
            final URLConnection cn = url.openConnection();
            cn.connect();
            cn.getInputStream().close();
            return true;
        } catch (MalformedURLException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }
    public static void startDownloader(){
        String dlPath;
        String outPutPath;
        Scanner scn = new Scanner(System.in);
        System.out.println(Welcome.messages[0]);
        dlPath = scn.nextLine();
        System.out.println(Welcome.messages[1]);
        outPutPath = scn.nextLine();
        if (Files.isDirectory(Paths.get(outPutPath))){
            System.out.println(Welcome.messages[3]);
            System.out.println(Welcome.messages[4]);
            try {
                URL dl = new URL(dlPath);
                ReadableByteChannel rbc = Channels.newChannel(dl.openStream());
                System.out.println(Welcome.messages[6]);
                String[] getFileName = dlPath.split("/");
                String name  = getFileName[getFileName.length - 1];
                outPutPath = outPutPath + File.separator + name;
                System.out.printf(Welcome.messages[8],outPutPath);
                System.out.println();
                FileOutputStream fos = new FileOutputStream(outPutPath);
                System.out.println(Welcome.messages[7]);
                fos.getChannel().transferFrom(rbc,0,Long.MAX_VALUE);
                System.out.println(Welcome.messages[9]);
            } catch (MalformedURLException e) {
                System.out.println(Welcome.messages[5]);
            } catch (IOException e) {
                System.out.println(Welcome.messages[5]);
            }
        }else{
            System.out.println(Welcome.messages[2]);
        }
    }
}
