public class Welcome {
    public static String[] messages = {
            "[>] Enter the \"URL\" of the file:",
            "[>] Which path should I put the downloaded file? (directory path) : ",
            "[!] Error : output directory does not exist.",
            "[*] A live connection is found.",
            "[~] About to download the file.. ",
            "[!] Error : could not connected to server. is URL correct?",
            "[*] Connected to server, awaiting response.. ",
            "[*] Downloading... ",
            "[*] the file will be saved at : %s",
            "[*] Downloading is finished <3 "
    };
    public static void ShowWelcomeMessage(){
        System.out.println("\t ************** Welcome To Downloader Version 0.1 **************");
        System.out.println("\t *              Coder : Kaveh Taher (thel0ner)                 *");
        System.out.println("\t *              GitHub : https://github.com/thel0ner           *");
        System.out.println("\t ***************************************************************");
        System.out.println("[~] Initializing... ");
    }
    public static void networkError(){
        System.out.println("[!] Error : No access to internet could be found.");
    }
}
