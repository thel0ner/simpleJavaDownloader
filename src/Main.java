public class Main {
    public static void main(String[] args) {
        Welcome.ShowWelcomeMessage();
        if (Downloader.isNetAvailable()){
            Downloader.startDownloader();
        }else{
            Welcome.networkError();
        }
    }
}
